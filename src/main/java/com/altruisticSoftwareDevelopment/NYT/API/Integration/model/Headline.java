package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Headline {
  private String main; // Main headline text
  private String kicker; // Secondary text, if available
  private String content_kicker; // Content kicker, if available
  private String print_headline; // Print version of the headline

  // Getters and setters
}
