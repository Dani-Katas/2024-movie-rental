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

  public String statement(final StatementPrinter statementPrinter) {
    return statementPrinter.print(getStatement());
  }

  public Statement getStatement() {
    return new Statement(name, rentals, getTotalAmount(), getFrequentRenterPoints());
  }

  private int getFrequentRenterPoints() {
    return rentals.stream().mapToInt(Rental::calculateFrequentRenterPoints).sum();
  }

  private double getTotalAmount() {
    return rentals.stream().mapToDouble(Rental::calculateAmount).sum();
  }

}
