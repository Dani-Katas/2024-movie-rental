package org.example;

public class Movie {

  private final String title;

  private final MovieType type;

  protected Movie(String title, final MovieType movieType) {
    this.title = title;
    this.type = movieType;
  }

  public static Movie createChildrens(final String title) {
    return new Movie(title, MovieType.CHILDRENS);
  }

  public static Movie createNewRelease(final String title) {
    return new Movie(title, MovieType.NEW_RELEASE);
  }

  public static Movie createRegular(final String title) {
    return new Movie(title, MovieType.REGULAR);
  }

  public String getTitle() {
    return title;
  }

  protected double basePrice() {
    return type.basePrice();
  }

  protected double penaltyAmount() {
    return type.penaltyAmount();
  }

  int frequentRenterPointsFor(int daysRented) {
    return type.frequentRenterPointsFor(daysRented);
  }

  private boolean hasPenaltyFor(final int daysRented) {
    return daysRented > type.maxRentingDays();
  }

  double calculateAmount(final int daysRented) {
    if (hasPenaltyFor(daysRented)) {
      return basePrice() + daysWithPenalty(daysRented) * penaltyAmount();
    }
    return basePrice();
  }

  private int daysWithPenalty(final int daysRented) {
    return daysRented - type.maxRentingDays();
  }
}
