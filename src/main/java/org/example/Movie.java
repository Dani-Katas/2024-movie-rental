package org.example;

public abstract class Movie {

  public static final int CHILDRENS = 2;

  public static final int NEW_RELEASE = 1;

  public static final int REGULAR = 0;

  private final String title;

  private final int priceCode;

  protected Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

  public static Movie createMovie(String title, int priceCode) {
    if (priceCode == CHILDRENS) {
      return new ChildrensMovie(title, priceCode);
    } else if (priceCode == NEW_RELEASE) {
      return new NewReleaseMovie(title, priceCode);
    } else if (priceCode == REGULAR) {
      return new RegularMovie(title, priceCode);
    }
    throw new RuntimeException("Unknown movie type " + priceCode);
  }

  public String getTitle() {
    return title;
  }

  int calculateFrequentRenterPoints(final int daysRented1) {
    if (priceCode == NEW_RELEASE && daysRented1 > 1) {
      return 2;
    } else {
      return 1;
    }
  }

  double calculateAmount(final int daysRented1) {
    double thisAmount = 0;

    //determine amounts for each line
    switch (priceCode) {
      case REGULAR:
        thisAmount += 2;
          if (daysRented1 > 2) {
              thisAmount += (daysRented1 - 2) * 1.5;
          }
        break;
      case NEW_RELEASE:
        thisAmount += daysRented1 * 3;
        break;
      case CHILDRENS:
        thisAmount += 1.5;
          if (daysRented1 > 3) {
              thisAmount += (daysRented1 - 3) * 1.5;
          }
        break;
    }
    return thisAmount;
  }
}
