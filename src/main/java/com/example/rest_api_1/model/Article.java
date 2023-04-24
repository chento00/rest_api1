package com.example.rest_api_1.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private String uuid;
    private String title;
    private String thumbnail;
    private String author;
}
