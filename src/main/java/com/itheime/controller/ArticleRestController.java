package com.itheime.controller;

import com.itheime.model.AjaxResponse;
import com.itheime.model.Article;

import com.itheime.service.AricleRestService;
import lombok.Data;
import lombok.extern.slf4j.Slf4j;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.spring.web.json.Json;

import javax.annotation.Resource;
import java.util.Date;
import java.util.logging.Logger;




@Slf4j
@Controller
@RestController
@RequestMapping(path = "/rest")
public class ArticleRestController {

    @Resource(name = "articleRestJDBCServiceImp")
    AricleRestService aricleRestService;


    //@RequestMapping(value = "/article", method = POST, produces = "application/json")
    @PostMapping("/article")
    public AjaxResponse saveArticle(@RequestParam String author,@RequestParam String title,@RequestParam String content) {
    /*public @ResponseBody  AjaxResponse saveArticle(@RequestParam String  id,
                                                   @RequestParam String  author) {*/

        //     log.info("saveArticle：{}", aricleRestService.saveArticle(article));
        Article article=new Article();
        article.setAuthor(author);
        article.setContent(content);
        article.setCreateTime(new Date());
        article.setTitle(title);
        aricleRestService.saveArticle(article);
        AjaxResponse success = AjaxResponse.success(article);
        return success;
//        return AjaxResponse.success(article);
    }

    //@RequestMapping(value = "/article/{id}", method = DELETE, produces = "application/json")
    @DeleteMapping("/article/{id}")
    public AjaxResponse deleteArticle(@PathVariable Long id) {

        aricleRestService.deleteArticle(id);

        return AjaxResponse.success(id);
    }

    //@RequestMapping(value = "/article/{id}", method = PUT, produces = "application/json")
    @PutMapping("/article/{id}")
    public AjaxResponse updateArticle(@PathVariable Long id, Article article) {
        article.setId(id);

        aricleRestService.updateArticle(article);

        return AjaxResponse.success(article);
    }

    //@RequestMapping(value = "/article/{id}", method = GET, produces = "application/json")
    @GetMapping("/article/{id}")
    public AjaxResponse getArticle(@PathVariable Long id) {
//        Date data=new Date();
//        Article article1 = Article.builder().id(1L).author("zimug").content("spring boot 2.深入浅出").title("t1").createTime(data).build();
        AjaxResponse success = AjaxResponse.success(aricleRestService.getArticle(id));
        return success;
    }
    @GetMapping("/article")
    public AjaxResponse getAllArticle() {
        AjaxResponse success = AjaxResponse.success(aricleRestService.getAll());
        return success;
    }
}