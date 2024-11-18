package org.example;

/**
 * The rental class represents a customer renting a movie.
 */
public class Rental {

    private final Movie movie;
    private final int daysRented;

    public Rental(Movie movie, int daysRented) {
        this.movie = movie;
        this.daysRented = daysRented;
    }

    public String getMovieTitle() {
        return movie.getTitle();
    }

    int calculateFrequentRenterPoints() {
        return movie.frequentRenterPointsFor(daysRented);
    }

    public double calculateAmount() {
        return movie.calculateAmount(daysRented);
    }
}
