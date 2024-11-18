package org.example;

import java.util.List;

import org.example.formatter.StatementFormatter;

public class Customer {

  private final String name;

  private final Rentals rentals = new Rentals();

  public Customer(String name) {
    this.name = name;
  }

  public void addRental(Rental arg) {
    rentals.getRentals().add(arg);
  }

  public String statement(final StatementFormatter statementFormatter) {
    return statementFormatter.print(getStatement());
  }

  public Statement getStatement() {
    final List<StatementRental> rentals = this.rentals.getRentals().stream().map(Rental::toStatement).toList();
    return new Statement(name, rentals, getTotalAmount(), getFrequentRenterPoints());
  }

  private int getFrequentRenterPoints() {
    return rentals.getRentals().stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
  }

  private double getTotalAmount() {
    return rentals.getRentals().stream().mapToDouble(Rental::calculateAmount).sum();
  }

}
