package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Byline {
  private String original; // Full author text
  private List<Person> person; // List of individual contributors
}
