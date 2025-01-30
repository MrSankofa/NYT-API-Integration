package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Doc {
  private String uri; // Unique identifier
  private String url; // Link to the article
  private long id; // Article ID
  private long asset_id; // Asset ID
  private String source; // Source of the article (e.g., "New York Times")
  private String published_date; // Date the article was published
  private String updated; // Last update timestamp
  private String section; // Section name (e.g., "Arts")
  private String subsection; // Subsection name
  private String nytdsection; // NYT-specific section name
  private String adx_keywords; // Keywords associated with the article
  private String column; // Column name, if available
  private Byline byline; // Author(s) of the article
  private String type; // Type of content (e.g., "Article")
  private String title; // Title of the article
  private Headline headline;
  @JsonProperty("abstract")
  private String summary; // Short description of the article
  private List<String> des_facet; // Descriptive facets
  private List<String> org_facet; // Organizational facets
  private List<String> per_facet; // Person-related facets
  private List<String> geo_facet; // Geographic facets
  private List<Multimedia> multimedia; // Media (e.g., images) attached to the article
  private String imageUrl; // Image URL for display (set dynamically)
  private String webUrl; // Field for the article's URL

}
