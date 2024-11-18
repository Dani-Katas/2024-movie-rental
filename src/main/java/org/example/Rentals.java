package org.example;

import java.util.ArrayList;
import java.util.List;

public final class Rentals {

  private final List<Rental> rentals;

  private Rentals() {
    this.rentals = new ArrayList<>() ;
  }

  public static Rentals empty() {
    return new Rentals();
  }

  double getTotalAmount() {
    return rentals.stream().mapToDouble(Rental::calculateAmount).sum();
  }

  int getFrequentRenterPoints() {
    return rentals.stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
  }

  List<StatementRental> toRentalStatements() {
    return rentals.stream().map(Rental::toStatement).toList();
  }

  void add(final Rental arg) {
    rentals.add(arg);
  }
}
