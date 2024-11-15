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
  protected int daysForExtraAmount() {
    return 0;
  }

  @Override
  protected double extraAmount() {
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
