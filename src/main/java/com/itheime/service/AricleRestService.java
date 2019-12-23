package com.itheime.service;

import com.itheime.model.Article;

import java.util.List;

public interface AricleRestService {

    public Article saveArticle(Article article);

    public void deleteArticle(Long id);

    public void updateArticle(Article article);

    public Article getArticle(Long id);

    public List<Article> getAll();
}
