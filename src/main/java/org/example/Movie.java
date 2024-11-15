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

  protected abstract int maxRentingDays();

  protected double penaltyAmount() {
    return 1.5;
  }

  int calculateFrequentRenterPoints(int daysRented) {
    return 1;
  }

  private boolean hasPenaltyFor(final int daysRented) {
    return daysRented > maxRentingDays();
  }

  double calculateAmount(final int daysRented) {
    if (hasPenaltyFor(daysRented)) {
      return basePrice() + daysWithPenalty(daysRented) * penaltyAmount();
    }
    return basePrice();
  }

  private int daysWithPenalty(final int daysRented) {
    return daysRented - maxRentingDays();
  }
}
