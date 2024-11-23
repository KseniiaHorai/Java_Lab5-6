package org.example;
/**
 * Abstract class representing a passenger car in a train.
 * This class is a specialization of the {@link BaseCar} class,
 * and it handles passenger and baggage details along with comfort levels.
 * It enforces a limit on the total number of passengers and bags combined.
 */
public abstract class PassengerBaseCar extends BaseCar {

    private static final int LIMIT = 380;

    protected int passengerCount;
    protected int bagsCount;
    protected final int comfortLevel;
    /**
     * Constructs a PassengerBaseCar with specified passenger count, baggage count,
     * and comfort level.
     *
     * @param passengerCount The number of passengers in the car.
     * @param bagsCount The number of bags in the car.
     * @param comfortLevel The comfort level of the car (higher values indicate more comfort).
     * @throws IllegalArgumentException if the sum of passengerCount and bagsCount exceeds the limit.
     */
    public PassengerBaseCar(int passengerCount, int bagsCount, int comfortLevel) {
        super(LIMIT);

        if (passengerCount + bagsCount > LIMIT) {
            throw new IllegalArgumentException("INVALID NUMBER OF PEOPLE AND BAGS");
        }

        this.passengerCount = passengerCount;
        this.bagsCount = bagsCount;
        this.comfortLevel = comfortLevel;
    }
    /**
     * Returns the number of passengers in the car.
     *
     * @return The number of passengers.
     */
    public int getPassengerCount() {
        return passengerCount;
    }
    /**
     * Returns the number of bags in the car.
     *
     * @return The number of bags.
     */
    public int getBagsCount() {
        return bagsCount;
    }
    /**
     * Returns the comfort level of the car.
     *
     * @return The comfort level of the car.
     */
    public int getComfortLevel() {
        return comfortLevel;
    }

    public void setPassengerCount(int count) {
        if (count >= 0 && count <= LIMIT - bagsCount) {
            this.passengerCount = count;
        }
    }
    /**
     * Sets the number of bags in the car.
     * Ensures that the total number of passengers and bags does not exceed the limit.
     *
     * @param count The new number of bags.
     */
    public void setbagsCount(int count) {
        if (count >= 0 && count <= LIMIT - passengerCount) {
            this.bagsCount = count;
        }
    }
    /**
     * Returns a string representation of the passenger car, including its class,
     * the number of passengers, the number of bags, and the comfort level.
     *
     * @return A string representing the passenger car.
     */
    @Override
    public String toString() {
        return "CAR CLASS: " + getClass().getSimpleName() +
                ", passengers: " + passengerCount + ", bags: " + bagsCount +
                ", comfort tier: " + comfortLevel;
    }
}
