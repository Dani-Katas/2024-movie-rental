package org.example;

public class NewReleaseMovie extends Movie {

  public NewReleaseMovie(final String title) {
    super(title, MovieType.NEW_RELEASE);
  }

  @Override
  int frequentRenterPointsFor(final int daysRented) {
    return daysRented > 1 ? 2 : 1;
  }

  @Override
  protected double penaltyAmount() {
    return 3;
  }

}
