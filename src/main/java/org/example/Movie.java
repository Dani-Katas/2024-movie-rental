package org.example;

public abstract class Movie {

    private final String title;

    protected final int priceCode;

  protected Movie(String title, int priceCode) {
    this.title = title;
    this.priceCode = priceCode;
  }

    public String getTitle() {
    return title;
  }

  abstract int calculateFrequentRenterPoints(int daysRented1);

    double calculateAmount(final int daysRented1) {
    double thisAmount = 0;

    //determine amounts for each line
    switch (priceCode) {
      case 0:
        thisAmount += 2;
          if (daysRented1 > 2) {
              thisAmount += (daysRented1 - 2) * 1.5;
          }
        break;
      case 1:
        thisAmount += daysRented1 * 3;
        break;
      case 2:
        thisAmount += 1.5;
          if (daysRented1 > 3) {
              thisAmount += (daysRented1 - 3) * 1.5;
          }
        break;
    }
    return thisAmount;
  }
}
