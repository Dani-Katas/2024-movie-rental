package org.example;

import java.util.List;

public record Statement(String name1, List<Rental> rentals1, double totalAmount, int frequentRenterPoints) {

  String asString() {
    String result = "Rental Record for " + name1() + "\n";

    for (Rental rental : rentals1()) {
      result += "\t" + rental.getMovieTitle() + "\t" + rental.calculateAmount() + "\n";
    }

    // add footer lines
    result += "Amount owed is " + totalAmount() + "\n";
    result += "You earned " + frequentRenterPoints() + " frequent renter points";

    return result;
  }
}