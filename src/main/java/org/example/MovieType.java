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
  };

  abstract double basePrice();

  abstract int maxRentingDays();

  double penaltyAmount() {
    if (this == MovieType.CHILDRENS || this == MovieType.REGULAR) {
      return 1.5;
    } else if (this == MovieType.NEW_RELEASE) {
      return 3;
    }
    throw new IllegalArgumentException();
  }

  int frequentRenterPointsFor(final int daysRented) {
    if (this == MovieType.CHILDRENS || this == MovieType.REGULAR) {
      return 1;
    } else if (this == MovieType.NEW_RELEASE) {
      return daysRented > 1 ? 2 : 1;
    }
    throw new IllegalArgumentException();
  }
}
