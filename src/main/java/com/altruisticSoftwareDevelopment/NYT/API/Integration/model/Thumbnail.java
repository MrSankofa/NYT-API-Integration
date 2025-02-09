package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;


@Getter
@Setter
@NoArgsConstructor
public class Thumbnail {
  @JsonProperty("url")
  private String url;
}
