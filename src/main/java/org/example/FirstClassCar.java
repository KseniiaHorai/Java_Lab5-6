package org.example;

public class FirstClassCar extends PassengerBaseCar {

    private static final int COMFORT_TIER = 30;

    public FirstClassCar(int passengerCount, int bagsCount) {
        super(passengerCount, bagsCount, COMFORT_TIER);
    }
}

