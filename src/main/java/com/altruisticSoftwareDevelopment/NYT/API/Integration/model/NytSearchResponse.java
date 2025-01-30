package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class NytSearchResponse {
  private String status;
  private String copyright;
  private int num_results;
  private Response response; // Contains the actual article data

  // Getters and setters
}
