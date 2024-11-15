package org.example;

public abstract class Movie {

  private final String title;

  protected Movie(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  protected abstract double basePrice();

  protected abstract int maxRetingDays();

  protected double extraAmount() {
    return 1.5;
  }

  abstract int calculateFrequentRenterPoints(int daysRented);

  boolean hasPenaltyFor(final int daysRented) {
    return daysRented > maxRetingDays();
  }

  double calculateAmount(final int daysRented) {
    if (hasPenaltyFor(daysRented)) {
      return basePrice() + daysWithPenalty(daysRented) * extraAmount();
    }
    return basePrice();
  }

  private int daysWithPenalty(final int daysRented) {
    return daysRented - maxRetingDays();
  }
}
