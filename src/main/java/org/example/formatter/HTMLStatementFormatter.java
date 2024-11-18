package org.example.formatter;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

import org.example.Rental;
import org.example.Statement;
import org.example.StatementRental;

public class HTMLStatementFormatter implements StatementFormatter {

  @Override
  public String print(final Statement statement) {
    return String.join("\n", List.of(
        h1("Rental Record for " + em(statement.name())),
        String.join("\n", table(statement.rentals().stream().map(this::toRow))),
        p("Amount owed is " + em(statement.totalAmount())),
        p("You earned " + em(statement.frequentRenterPoints()) + " frequent renter points")
    ));
  }

  private String toRow(final StatementRental rental) {
    final String column1 = td(rental.title());
    final String column2 = td(rental.amount());
    return tr(column1 + column2);
  }

  public String h1(final String content) {
    return wrap("h1", content);
  }

  public String td(final String content) {
    return wrap("td", content);
  }

  public String tr(final String content) {
    return wrap("tr", content);
  }

  public String td(final double content) {
    return td(String.valueOf(content));
  }

  public String p(final String content) {
    return wrap("p", content);
  }

  public String em(final String content) {
    return wrap("em", content);
  }

  public String em(final double content) {
    return em(String.valueOf(content));
  }

  public String em(final int content) {
    return em(String.valueOf(content));
  }

  private List<String> table(Stream<String> content) {
    return wrapNested("table", content);
  }

  public String wrap(String tag, String content) {
    return open(tag) + content + close(tag);
  }

  private String close(final String tag) {
    return "</" + tag + ">";
  }

  private String open(final String tag) {
    return "<" + tag + ">";
  }

  public List<String> wrapNested(String tag, Stream<String> content) {
    ArrayList<String> lines = new ArrayList<>();
    lines.add(open(tag));
    lines.addAll(content.map(this::indent).toList());
    lines.add(close(tag));
    return lines;
  }

  private String indent(final String line) {
    return "  " + line;
  }
}
