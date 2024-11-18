package org.example;

public final class Movie {

  private final String title;

  private final MovieType type;

  private Movie(String title, final MovieType movieType) {
    this.title = title;
    this.type = movieType;
  }

  public static Movie childrens(final String title) {
    return new Movie(title, MovieType.CHILDRENS);
  }

  public static Movie newRelease(final String title) {
    return new Movie(title, MovieType.NEW_RELEASE);
  }

  public static Movie regular(final String title) {
    return new Movie(title, MovieType.REGULAR);
  }

  public String getTitle() {
    return title;
  }

  int frequentRenterPointsFor(int daysRented) {
    return type.frequentRenterPointsFor(daysRented);
  }

  private boolean hasPenaltyFor(final int daysRented) {
    return daysRented > type.maxRentingDays();
  }

  double calculateAmount(final int daysRented) {
    if (hasPenaltyFor(daysRented)) {
      return type.basePrice() + daysWithPenalty(daysRented) * type.penaltyAmount();
    }
    return type.basePrice();
  }

  private int daysWithPenalty(final int daysRented) {
    return daysRented - type.maxRentingDays();
  }
}
