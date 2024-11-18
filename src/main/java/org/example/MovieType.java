package org.example;

public enum MovieType {
  CHILDRENS {
    @Override
    double basePrice() {
      return 1.5;
    }

    @Override
    int maxRentingDays() {
      return 3;
    }

    @Override
    double penaltyAmount() {
      return 1.5;
    }

    @Override
    int frequentRenterPointsFor(final int daysRented) {
      return 1;
    }
  },
  NEW_RELEASE {
    @Override
    double basePrice() {
      return 3;
    }

    @Override
    int maxRentingDays() {
      return 1;
    }

    @Override
    double penaltyAmount() {
      return 3;
    }

    @Override
    int frequentRenterPointsFor(final int daysRented) {
      return daysRented > 1 ? 2 : 1;
    }
  },
  REGULAR {
    @Override
    double basePrice() {
      return 2;
    }

    @Override
    int maxRentingDays() {
      return 2;
    }

    @Override
    double penaltyAmount() {
      return 1.5;
    }

    @Override
    int frequentRenterPointsFor(final int daysRented) {
      return 1;
    }
  };

  abstract double basePrice();

  abstract int maxRentingDays();

  abstract double penaltyAmount();

  abstract int frequentRenterPointsFor(final int daysRented);

}
