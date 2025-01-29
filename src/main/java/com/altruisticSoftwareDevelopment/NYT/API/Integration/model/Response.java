package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import java.util.List;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Response {
  private List<Doc> docs; // List of articles

  // Getters and setters
}
