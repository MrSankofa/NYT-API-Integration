package com.altruisticSoftwareDevelopment.NYT.API.Integration.controller;

import com.altruisticSoftwareDevelopment.NYT.API.Integration.model.Article;
import com.altruisticSoftwareDevelopment.NYT.API.Integration.service.ArticleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ArticleController {

  @Autowired
  private ArticleService articleService;

  @GetMapping
  public List<Article> getArticle() {
    return articleService.getMostPopularArticles();
  }
}
