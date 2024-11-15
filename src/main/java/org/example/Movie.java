package org.example;

public abstract class Movie {

  private final String title;

  protected Movie(String title) {
    this.title = title;
  }

  public String getTitle() {
    return title;
  }

  abstract int calculateFrequentRenterPoints(int daysRented);

  abstract double calculateAmount(int daysRented);
}
