package org.example;

public class NewReleaseMovie extends Movie {

  public NewReleaseMovie(final String title) {
    super(title, 1);
  }

  @Override
  int calculateFrequentRenterPoints(final int daysRented) {
    return daysRented > 1 ? 2 : 1;
  }
}
