package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Multimedia {
  private String type; // Type of media (e.g., "image")
  private String subtype; // Subtype of media (e.g., "photo")
  private String caption; // Caption or description of the media
  private String copyright; // Copyright holder
  private String url; // URL of the media
  private int height; // Height of the media (if applicable)
  private int width; // Width of the media (if applicable)

  // Getters and setters
}
