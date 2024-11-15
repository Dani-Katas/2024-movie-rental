package org.example;

public class RegularMovie extends Movie {

  public RegularMovie(final String title) {
    super(title);
  }

  @Override
  protected double basePrice() {
    return 2;
  }

  @Override
  protected int maxRentingDays() {
    return 2;
  }
}
