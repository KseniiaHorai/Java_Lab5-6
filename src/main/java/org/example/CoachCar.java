package org.example;
/**
 * The CoachCar is an affordable train car with its own capacity, number of passengers and bags, and comfort tier.
 */
public class CoachCar extends PassengerBaseCar {
    /**
     * COMFORT TIER by default.
     */
    private static final int COMFORT_TIER = 5;
    /**
     * CoachCar - CONSTRUCTOR with its own capacity, number of passengers and bags, and comfort tier
     *
     * @param passengerCount NUMBER OF passengers.
     * @param bagsCount   NUMBER OF bags.
     */
    public CoachCar(int passengerCount, int bagsCount) {
        super(passengerCount, bagsCount, COMFORT_TIER);
    }
}


