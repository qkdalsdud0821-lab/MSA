package se.magnus.api.composite.product;

public class RecommendationSummary {

  private int recommendationId;
  private String author;
  private int rate;

  public RecommendationSummary() {
    recommendationId = 0;
    author = null;
    rate = 0;
  }

  public RecommendationSummary(int recommendationId, String author, int rate) {
    this.recommendationId = recommendationId;
    this.author = author;
    this.rate = rate;
  }

  public int getRecommendationId() {
    return recommendationId;
  }

  public String getAuthor() {
    return author;
  }

  public int getRate() {
    return rate;
  }
}