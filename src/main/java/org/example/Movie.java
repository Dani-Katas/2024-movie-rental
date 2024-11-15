package org.example;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int NEW_RELEASE = 1;
    public static final int REGULAR = 0;

    private String _title;
    private int _priceCode;

    public Movie(String title, int priceCode) {
        _title = title;
        _priceCode = priceCode;
    }

    public int getPriceCode() {
        return _priceCode;
    }

    public void setPriceCode(int arg) {
        _priceCode = arg;
    }
    public String getTitle() {
        return _title;
    }

    boolean isNewRelease() {
        return getPriceCode() == NEW_RELEASE;
    }

    int calculateFrequentRenterPoints(final int daysRented1) {
        if (isNewRelease() && daysRented1 > 1) {
            return 2;
        } else {
            return 1;
        }
    }

    double calculateAmount(final int daysRented1) {
        double thisAmount = 0;

        //determine amounts for each line
        switch (getPriceCode()) {
            case REGULAR:
                thisAmount += 2;
                if (daysRented1 > 2)
                    thisAmount += (daysRented1 - 2) * 1.5;
                break;
            case NEW_RELEASE:
                thisAmount += daysRented1 * 3;
                break;
            case CHILDRENS:
                thisAmount += 1.5;
                if (daysRented1 > 3)
                    thisAmount += (daysRented1 - 3) * 1.5;
                break;
        }
        return thisAmount;
    }
}
