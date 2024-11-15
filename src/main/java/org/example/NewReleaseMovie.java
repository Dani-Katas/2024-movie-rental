package org.example;

public class NewReleaseMovie extends Movie {

  public NewReleaseMovie(final String title) {
    super(title);
  }

  @Override
  int calculateFrequentRenterPoints(final int daysRented) {
    return daysRented > 1 ? 2 : 1;
  }

  @Override
  protected double basePrice() {
    return 0;
  }

  @Override
  protected int maxRetingDays() {
    return 0;
  }

  @Override
  protected double extraAmount() {
    return 3;
  }

}
