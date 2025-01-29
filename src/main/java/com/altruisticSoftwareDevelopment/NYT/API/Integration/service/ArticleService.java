package com.altruisticSoftwareDevelopment.NYT.API.Integration.service;

import com.altruisticSoftwareDevelopment.NYT.API.Integration.model.*;
import jakarta.annotation.PostConstruct;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.ArrayList;
import java.util.Collections;
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

//    articles = updateImageUrl(articles);
    if(response != null && response.getStatus().equals("OK")) {
      return response.getResults();
    } else {
      return articles;
    }
  }

  public List<Article> updateImageUrl(List<Article> articles) {
    return articles.stream().map( article -> {

      if(article.getMedia().size() > 0 && article.getMedia().get(0).getMediaMetadata().size() > 0 && article.getMedia().get(0).getMediaMetadata().get(0).getUrl() != null) {
        article.setImageUrl(article.getMedia().get(0).getMediaMetadata().get(0).getUrl());
      }

      return article;
    }).toList();
  }

  public List<Doc> getSearchResults(String searchText) {
    String url = "https://api.nytimes.com/svc/search/v2/articlesearch.json?q=" + searchText + "&api-key=" + apiKey;

    ResponseEntity<NytSearchResponse> responseEntity =
        restTemplate.getForEntity(url, NytSearchResponse.class);

    if (responseEntity.getBody() != null && responseEntity.getBody().getResponse() != null) {
      List<Doc> docs = responseEntity.getBody().getResponse().getDocs();

      // Set image URL for each doc
      for (Doc doc : docs) {
        for (Multimedia media : doc.getMultimedia()) {
          if ("largeHorizontal375".equals(media.getSubtype())) {
            doc.setImageUrl("https://www.nytimes.com/" + media.getUrl());
            break;
          }
        }
      }
      return docs;
    }
    return Collections.emptyList();
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
