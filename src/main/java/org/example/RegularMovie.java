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
  double calculateAmount(final int daysRented) {
    double thisAmount = 2;
    final int daysAfterSecondDay = daysRented - 2;
    if (daysAfterSecondDay > 0) {
      thisAmount += daysAfterSecondDay * 1.5;
    }
    return thisAmount;
  }
}
