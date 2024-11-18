package org.example.formatter;

import org.example.Rental;
import org.example.Statement;

public class HTMLStatementFormatter implements StatementFormatter {

  @Override
  public String print(final Statement statement) {
    String result = "<h1>Rental Record for <em>" + statement.name() + "</em></h1>\n";

    result+="<table>\n";
    for (Rental rental : statement.rentals()) {
      result += "  <tr><td>" + rental.getMovieTitle() + "</td><td>" + rental.calculateAmount() + "</td></tr>\n";
    }
    result+="</table>\n";

    // add footer lines
    result += "<p>Amount owed is <em>" + statement.totalAmount() + "</em></p>\n";
    result += "<p>You earned <em>" + statement.frequentRenterPoints() + "</em> frequent renter points</p>";

    return result;
  }
}
