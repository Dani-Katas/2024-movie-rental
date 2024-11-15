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
  double calculateAmount(final int daysRented) {
    double thisAmount = 1.5;
    final int daysAfterThirdDay = daysRented - 3;
    if (daysAfterThirdDay > 0) {
      thisAmount += daysAfterThirdDay * 1.5;
    }
    return thisAmount;
  }
}
