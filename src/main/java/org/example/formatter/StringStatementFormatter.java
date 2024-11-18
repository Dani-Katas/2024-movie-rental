package org.example.formatter;

import java.util.ArrayList;

import org.example.Statement;
import org.example.StatementRental;

public final class StringStatementFormatter implements StatementFormatter {

  @Override
  public String print(final Statement statement) {
    ArrayList<String> lines = new ArrayList<>();
    lines.add("Rental Record for " + statement.name());
    for (StatementRental rental : statement.rentals()) {
      lines.add(indent(toRow(rental)));
    }
    lines.add("Amount owed is " + statement.totalAmount());
    lines.add("You earned " + statement.frequentRenterPoints() + " frequent renter points");
    return String.join("\n", lines);
  }

  private String toRow(final StatementRental rental) {
    return rental.title() + "\t" + rental.amount();
  }

  private String indent(final String text) {
    return "\t" + text;
  }
}
