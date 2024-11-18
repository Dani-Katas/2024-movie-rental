package org.example.formatter;

import org.example.Rental;
import org.example.Statement;

public class StringStatementFormatter implements StatementFormatter {

  @Override
  public String print(final Statement statement) {
    String result = "Rental Record for " + statement.name() + "\n";

    for (Rental rental : statement.rentals()) {
      result += "\t" + rental.getMovieTitle() + "\t" + rental.calculateAmount() + "\n";
    }

    // add footer lines
    result += "Amount owed is " + statement.totalAmount() + "\n";
    result += "You earned " + statement.frequentRenterPoints() + " frequent renter points";

    return result;
  }
}
