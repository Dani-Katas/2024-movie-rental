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

  protected abstract int daysForExtraAmount();

  protected double extraAmount() {
    return 1.5;
  }

  abstract int calculateFrequentRenterPoints(int daysRented);

  abstract double calculateAmount(int daysRented);
}
