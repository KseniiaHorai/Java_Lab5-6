package org.example;

public class BusinessCar extends PassengerBaseCar {

    private static final int COMFORT_TIER = 10;

    public BusinessCar(int passengerCount, int bagsCount) {
        super(passengerCount, bagsCount, COMFORT_TIER);
    }
}
