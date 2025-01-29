package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Result {
  private String uri;
  private String url;
  private long id;
  private long asset_id;
  private String source;
  private String published_date;
  private String updated;
  private String section;
  private String subsection;
  private String nytdsection;
  private String adx_keywords;
  private String column;
  private Byline byline; // Author details
  private String type; // E.g., "Article"
  private String title;

  @JsonProperty("abstract")
  private String summary;
  private List<String> des_facet; // Descriptive facets
  private List<String> org_facet; // Organization facets
  private List<String> per_facet; // Person facets
  private List<String> geo_facet; // Geographic facets
  private List<Media> media; // Media details
  private int eta_id; // Eta identifier
  // Getters and setters
}
