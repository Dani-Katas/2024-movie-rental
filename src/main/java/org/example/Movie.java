package org.example;

public abstract class Movie {

  protected final int priceCode;

  private final String title;

  protected Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public String getTitle() {
    return title;
  }

  abstract int calculateFrequentRenterPoints(int daysRented);

  abstract double calculateAmount(int daysRented);
}
