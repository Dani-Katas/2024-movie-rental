package org.example;

public class ChildrensMovie extends Movie {

  public ChildrensMovie(final String title) {
    super(title);
  }

  @Override
  int calculateFrequentRenterPoints(final int daysRented) {
    return 1;
  }

  @Override
  protected double basePrice() {
    return 1.5;
  }

  @Override
  protected int maxRetingDays() {
    return 3;
  }
}
