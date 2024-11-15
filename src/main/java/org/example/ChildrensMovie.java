package org.example;

public class ChildrensMovie extends Movie {

  public ChildrensMovie(final String title) {
    super(title);
  }

  @Override
  protected double basePrice() {
    return 1.5;
  }

  @Override
  protected int maxRentingDays() {
    return 3;
  }
}
