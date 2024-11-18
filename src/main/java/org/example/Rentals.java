package org.example;

import java.util.ArrayList;
import java.util.List;

public class Rentals {

  private final List<Rental> rentals;

  public Rentals(final List<Rental> rentals) {
    this.rentals = new ArrayList<>(rentals) ;
  }

  public Rentals() {
    this.rentals = new ArrayList<>() ;
  }

  public List<Rental> getRentals() {
    return rentals;
  }
}
