package org.example;

public class StringStatementPrinter implements StatementPrinter {

  @Override
  public String print(final Statement statement) {
    return statement.asString();
  }
}
