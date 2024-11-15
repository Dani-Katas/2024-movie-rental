package org.example;

public class RegularMovie extends Movie {

  public RegularMovie(final String title) {
    super(title, 0);
  }

  @Override
  int calculateFrequentRenterPoints(final int daysRented1) {
    return 1;
  }
}
