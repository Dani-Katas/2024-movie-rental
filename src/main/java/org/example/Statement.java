package org.example;

import java.util.List;

public record Statement(
    String name,
    List<StatementRental> rentals,
    double totalAmount,
    int frequentRenterPoints
) {}

