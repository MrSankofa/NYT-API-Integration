package com.altruisticSoftwareDevelopment.NYT.API.Integration.service;

import com.altruisticSoftwareDevelopment.NYT.API.Integration.model.Article;
import com.altruisticSoftwareDevelopment.NYT.API.Integration.model.NytResponse;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.List;

@Service
public class ArticleService {

  @Value("${api_key}")
  private String apiKey;

  @Value("${mostPopularUrl}")
  private String mostPopularUrl;

  @Autowired
  RestTemplate restTemplate;

  public List<Article> getMostPopularArticles() {
    String url = mostPopularUrl + "api-key=" + apiKey;
    NytResponse response = restTemplate.getForObject(url, NytResponse.class);

    List<Article> articles = new ArrayList<>();

    if(response != null && response.getStatus().equals("OK")) {
      return response.getResults();
    } else {
      return articles;
    }
  }

//  @PostConstruct
//  public void init() {
////    System.out.println("Resolved API Key: " + apiKey);
//  }

//  @PostConstruct
//  public void init() {
//    String envApiKey = System.getenv("NYT_API_KEY");
//    System.out.println("Environment Variable NYT_API_KEY: " + envApiKey);
//  }
}
