package org.example;

import java.util.ArrayList;
import java.util.List;

public class Customer {

    private final String name;
    private final List<Rental> rentals = new ArrayList<>();

    public Customer(String name) {
        this.name = name;
    }

    public void addRental(Rental arg) {
        rentals.add(arg);
    }

    public String statement() {
      String result = "Rental Record for " + name + "\n";

        for (Rental rental : rentals) {
          result += "\t" + rental.getMovieTitle() + "\t" + rental.calculateAmount() + "\n";
        }

        // add footer lines
        result += "Amount owed is " + getTotalAmount() + "\n";
        result += "You earned " + getFrequentRenterPoints() + " frequent renter points";

        return result;
    }

    private int getFrequentRenterPoints() {
      return rentals.stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
    }

    private double getTotalAmount() {
      return rentals.stream().mapToDouble(Rental::calculateAmount).sum();
    }

}
