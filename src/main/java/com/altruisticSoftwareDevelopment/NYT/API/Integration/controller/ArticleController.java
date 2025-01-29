package com.altruisticSoftwareDevelopment.NYT.API.Integration.controller;

import com.altruisticSoftwareDevelopment.NYT.API.Integration.model.Article;
import com.altruisticSoftwareDevelopment.NYT.API.Integration.service.ArticleService;
import com.altruisticSoftwareDevelopment.NYT.API.Integration.model.Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
public class ArticleController {

  @Autowired
  private ArticleService articleService;

  @GetMapping("/")
  public String getArticle(Model model) {

    List<Article> articles = articleService.getMostPopularArticles();
    articles = articleService.updateImageUrl(articles);


    model.addAttribute("articleList", articles);

    return "index";
  }

  @GetMapping("/search")
  public String showSearchPage() {
    return "search";
  }

  @PostMapping("/search")
  public String getSearchResults(@RequestParam String searchText, Model model) {
    List<Doc> searchResults = articleService.getSearchResults(searchText);
    model.addAttribute("searchResults", searchResults);
    return "search-results";
  }
}
