package org.example;

import java.util.ArrayList;
import java.util.List;

public class Rentals {

  private final List<Rental> rentals;

  private Rentals() {
    this.rentals = new ArrayList<>() ;
  }

  public static Rentals empty() {
    return new Rentals();
  }

  public List<Rental> getRentals() {
    return rentals;
  }

  double getTotalAmount() {
    return getRentals().stream().mapToDouble(Rental::calculateAmount).sum();
  }

  int getFrequentRenterPoints() {
    return getRentals().stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
  }

  List<StatementRental> toRentalStatements() {
    return getRentals().stream().map(Rental::toStatement).toList();
  }

  boolean add(final Rental arg) {
    return getRentals().add(arg);
  }
}
