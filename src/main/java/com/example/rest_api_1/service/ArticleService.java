package com.example.rest_api_1.service;

import com.example.rest_api_1.model.Article;
import java.util.List;
public interface ArticleService {
    List<Article> selectAll();
    Article selectByID();
    void insertArticle(Article article);
}
