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
  protected int daysForExtraAmount() {
    return 2;
  }

  @Override
  double calculateAmount(final int daysRented) {
    double thisAmount = basePrice();
    final int daysAfter = daysRented - daysForExtraAmount();
    if (daysAfter > 0) {
      thisAmount += daysAfter * extraAmount();
    }
    return thisAmount;
  }
}
