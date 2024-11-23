package org.example;

public abstract class BaseCar {
    /**
     * Abstract class representing a base car in a train.
     * This class provides the fundamental properties and behavior
     * that all types of cars (e.g., coach, business, first class) will inherit.
     */
    private final int number;
    /**
     * Constructs a new BaseCar with a specific car number.
     *
     * @param number The unique identifier for the car.
     */
    public BaseCar(int number) {
        this.number = number;
    }
}
