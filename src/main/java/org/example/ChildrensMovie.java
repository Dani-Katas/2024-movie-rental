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
  protected int daysForExtraAmount() {
    return 3;
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
