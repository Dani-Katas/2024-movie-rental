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
    return 3;
  }

  @Override
  protected int maxRentingDays() {
    return 1;
  }

  @Override
  protected double penaltyAmount() {
    return 3;
  }

}
