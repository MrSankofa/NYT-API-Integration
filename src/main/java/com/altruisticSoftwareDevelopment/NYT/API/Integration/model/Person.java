package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Person {
  private String firstname;
  private String lastname;
  private String role;

  // Getters and setters
}
