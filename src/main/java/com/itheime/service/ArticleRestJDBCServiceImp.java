package com.itheime.service;

import com.itheime.dao.ArticleJDBCDAO;
import com.itheime.model.Article;
import lombok.extern.slf4j.Slf4j;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.annotation.Resource;
import java.util.List;

@Slf4j
@Service
public class ArticleRestJDBCServiceImp implements AricleRestService {

    @Resource
    ArticleJDBCDAO articleJDBCDAO;


    @Transactional
    @Override
    public Article saveArticle(Article article) {

        articleJDBCDAO.save(article);


        return article;
    }

    @Override
    public void deleteArticle(Long id) {
        articleJDBCDAO.deleteById(id);
    }

    @Override
    public void updateArticle(Article article) {
        articleJDBCDAO.updateById(article);
    }

    @Override
    public Article getArticle(Long id) {
        return articleJDBCDAO.findById(id);

    }

    @Override
    public List<Article> getAll() {
        return articleJDBCDAO.findAll();
    }
}



