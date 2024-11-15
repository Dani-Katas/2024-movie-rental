package org.example;

public class RegularMovie extends Movie {

  public RegularMovie(final String title) {
    super(title);
  }

  @Override
  int calculateFrequentRenterPoints(final int daysRented) {
    return 1;
  }

  @Override
  protected double basePrice() {
    return 2;
  }

  @Override
  protected int maxRetingDays() {
    return 2;
  }
}
