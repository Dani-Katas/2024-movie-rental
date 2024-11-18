package org.example;

public enum MovieType {
  CHILDRENS,
  NEW_RELEASE,
  REGULAR;

  double basePrice() {
    return switch (this) {
      case REGULAR -> 2;
      case NEW_RELEASE -> 3;
      case CHILDRENS -> 1.5;
    };
  }

  int maxRentingDays() {
    return switch (this) {
      case REGULAR -> 2;
      case NEW_RELEASE -> 1;
      case CHILDRENS -> 3;
    };
  }

  double penaltyAmount() {
    return switch (this) {
      case CHILDRENS, REGULAR -> 1.5;
      case NEW_RELEASE -> 3;
    };
  }

  int frequentRenterPointsFor(final int daysRented) {
    return switch (this) {
      case CHILDRENS, REGULAR -> 1;
      case NEW_RELEASE -> daysRented > 1 ? 2 : 1;
    };
  }
}
