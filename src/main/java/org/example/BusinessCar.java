package org.example;
/**
 * The BusinessCar is a pricier train car with its own capacity, number of passengers and bags, and comfort tier.
 */
public class BusinessCar extends PassengerBaseCar {
    /**
     * COMFORT TIER by default.
     */
    private static final int COMFORT_TIER = 10;
    /**
     * BusinessCar - CONSTRUCTOR with its own capacity, number of passengers and bags, and comfort tier
     *
     * @param passengerCount NUMBER OF passengers.
     * @param bagsCount   NUMBER OF bags.
     */
    public BusinessCar(int passengerCount, int bagsCount) {
        super(passengerCount, bagsCount, COMFORT_TIER);
    }
}