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

    String getMovieTitle() {
        return movie.getTitle();
    }

    int calculateFrequentRenterPoints() {
        if ((movie.getPriceCode() == Movie.NEW_RELEASE) && daysRented > 1) {
          return 2;
        } else {
            return 1;
        }
    }

    double calculateAmount() {
        double thisAmount = 0;

        //determine amounts for each line
        switch (movie.getPriceCode()) {
            case Movie.REGULAR:
                thisAmount += 2;
                if (daysRented > 2)
                    thisAmount += (daysRented - 2) * 1.5;
                break;
            case Movie.NEW_RELEASE:
                thisAmount += daysRented * 3;
                break;
            case Movie.CHILDRENS:
                thisAmount += 1.5;
                if (daysRented > 3)
                    thisAmount += (daysRented - 3) * 1.5;
                break;
        }
        return thisAmount;
    }

}
