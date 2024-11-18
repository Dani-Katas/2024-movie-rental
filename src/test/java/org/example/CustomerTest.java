package org.example;

import static org.assertj.core.api.AssertionsForClassTypes.assertThat;

import org.example.formatter.HTMLStatementFormatter;
import org.example.formatter.StringStatementFormatter;
import org.junit.jupiter.api.Test;

public class CustomerTest {

  @Test
  public void test() {
    Customer customer = new Customer("Bob");
    customer.addRental(new Rental(Movie.createRegular("Jaws"), 2));
    customer.addRental(new Rental(Movie.createRegular("Golden Eye"), 3));
    customer.addRental(new Rental(Movie.createNewRelease("Short New"), 1));
    customer.addRental(new Rental(Movie.createNewRelease("Long New"), 2));
    customer.addRental(new Rental(Movie.createChildrens("Bambi"), 3));
    customer.addRental(new Rental(Movie.createChildrens("Toy Story"), 4));

    String expected = "" +
        "Rental Record for Bob\n" +
        "\tJaws\t2.0\n" +
        "\tGolden Eye\t3.5\n" +
        "\tShort New\t3.0\n" +
        "\tLong New\t6.0\n" +
        "\tBambi\t1.5\n" +
        "\tToy Story\t3.0\n" +
        "Amount owed is 19.0\n" +
        "You earned 7 frequent renter points";

    assertThat(customer.statement(new StringStatementFormatter())).isEqualTo(expected);
  }

  @Test
  public void htmlTest() {
    Customer customer = new Customer("martin");
    customer.addRental(new Rental(Movie.createRegular("Ran"), 3));
    customer.addRental(new Rental(Movie.createRegular("Trois Couleurs: Bleu"), 2));

    String expected = "<h1>Rental Record for <em>martin</em></h1>\n"
        + "<table>\n"
        + "  <tr><td>Ran</td><td>3.5</td></tr>\n"
        + "  <tr><td>Trois Couleurs: Bleu</td><td>2.0</td></tr>\n"
        + "</table>\n"
        + "<p>Amount owed is <em>5.5</em></p>\n"
        + "<p>You earned <em>2</em> frequent renter points</p>";

    assertThat(customer.statement(new HTMLStatementFormatter())).isEqualTo(expected);
  }
}