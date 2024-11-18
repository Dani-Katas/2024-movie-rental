package org.example;

import org.example.formatter.StatementFormatter;

public class Customer {

  private final String name;

  private final Rentals rentals = Rentals.empty();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental rental) {
    rentals.add(rental);
  }

  public String statement(final StatementFormatter statementFormatter) {
    return statementFormatter.print(toStatement());
  }

  private Statement toStatement() {
    return new Statement(
        name,
        rentals.toRentalStatements(),
        rentals.getTotalAmount(),
        rentals.getFrequentRenterPoints()
    );
  }
}
