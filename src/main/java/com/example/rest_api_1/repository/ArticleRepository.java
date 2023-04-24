package com.example.rest_api_1.repository;

import com.example.rest_api_1.model.Article;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;
import java.util.List;
@Mapper
@Repository
public interface ArticleRepository {
    @Select("""
           SELECT *FROM articles
            """)
    List<Article> findAll();
    @Insert("""
            INSERT INTO articles  (uuid,title,thumbnail,author)
           VALUES(#{article.uuid},#{article.title},#{article.thumbnail},#{article.author})
            """)
    void insertArticle(@Param("article") Article article);

}
