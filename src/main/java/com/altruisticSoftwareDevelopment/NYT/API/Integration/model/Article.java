package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
public class Article {
  private Long id;
  private String url;
  private String section;
  private String subsection;
  private Byline byline;
  private String title;
  private Headline headline;

  private List<Multimedia> multimedia;
  private String imageUrl; // Set dynamically

  @JsonProperty("abstract")
  private String summary;

  private List<Media> media;

}
