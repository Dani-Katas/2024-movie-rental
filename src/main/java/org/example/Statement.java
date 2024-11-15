package org.example;

import java.util.List;

public record Statement(
    String name,
    List<Rental> rentals,
    double totalAmount,
    int frequentRenterPoints
) {}