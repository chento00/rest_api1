package com.example.rest_api_1.controller;

import com.example.rest_api_1.model.Article;
import com.example.rest_api_1.service.ArticleService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;
@RestController
public class ArticleController {
    private final ArticleService articleService;

    public ArticleController(ArticleService articleService) {
        this.articleService = articleService;
    }
    @GetMapping("/article")
    List<Article> selectAllArticle(){
        return articleService.selectAll();
    }
    @PostMapping("/article")
    void insertArticle(@RequestBody Article article){
        articleService.insertArticle(article);
    }
}
