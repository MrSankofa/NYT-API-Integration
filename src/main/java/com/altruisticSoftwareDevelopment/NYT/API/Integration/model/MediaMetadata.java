package com.altruisticSoftwareDevelopment.NYT.API.Integration.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class MediaMetadata {
  private String url; // URL to the media resource
  private String format; // E.g., "Standard Thumbnail", "mediumThreeByTwo210"
  private int height; // Height of the image
  private int width; // Width of the image
  // Getters and setters
}
