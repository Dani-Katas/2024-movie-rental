package org.example;

public class ChildrensMovie extends Movie {

  public ChildrensMovie(final String title) {
    super(title, 2);
  }

  @Override
  int calculateFrequentRenterPoints(final int daysRented1) {
    return 1;
  }
}
