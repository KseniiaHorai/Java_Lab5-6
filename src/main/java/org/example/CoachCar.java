package org.example;

public class CoachCar extends PassengerBaseCar {

    private static final int COMFORT_TIER = 10;

    public CoachCar(int passengerCount, int bagsCount) {
        super(passengerCount, bagsCount, COMFORT_TIER);
    }
}
