package org.example;
/**
 * The FirstClassCar is an expensive train car with its own capacity, number of passengers and bags, and comfort tier.
 */
public class FirstClassCar extends PassengerBaseCar {
    /**
     * COMFORT TIER by default.
     */
    private static final int COMFORT_TIER = 30;
    /**
     * FirstClassCar - CONSTRUCTOR with its own capacity, number of passengers and bags, and comfort tier
     *
     * @param passengerCount NUMBER OF passengers.
     * @param bagsCount   NUMBER OF bags.
     */
    public FirstClassCar(int passengerCount, int bagsCount) {
        super(passengerCount, bagsCount, COMFORT_TIER);
    }
}
