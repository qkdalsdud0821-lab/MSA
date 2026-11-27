package se.magnus.api.composite.product;

public class ReviewSummary {

  private int reviewId;
  private String author;
  private String subject;

  public ReviewSummary() {
    reviewId = 0;
    author = null;
    subject = null;
  }

  public ReviewSummary(int reviewId, String author, String subject) {
    this.reviewId = reviewId;
    this.author = author;
    this.subject = subject;
  }

  public int getReviewId() {
    return reviewId;
  }

  public String getAuthor() {
    return author;
  }

  public String getSubject() {
    return subject;
  }
}