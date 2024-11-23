package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
/**
 * MyTrain is a train with PassengerBaseCars.
 */
public class MyTrain {
    /**
     * cars - LIST OF PassengerBaseCars.
     */
    public final List<PassengerBaseCar> cars;

    /**
     * MyTrain - CONSTRUCTOR with the list of PassengerBaseCars.
     *
     * @param cars LIST OF PassengerBaseCars.
     */
    public MyTrain(List<PassengerBaseCar> cars) {
        this.cars = cars;
    }

    /**
     * calculateTotalPassengersAndBags counts the number of passengers and bags.
     *
     * @return LIST OF passengers and bags.
     */
    public List<Integer> calculateTotalPassengersAndBags() {
        int totalPassengers = 0;
        int totalBags = 0;

        for (PassengerBaseCar car : cars) {
            totalPassengers += car.getPassengerCount();
            totalBags += car.getBagsCount();
        }

        return List.of(totalPassengers, totalBags);
    }

    /**
     * PassengerBaseCar uses comfort tier to sort.
     *
     * @return SORTED LIST OF PassengerBaseCars based on comfort.
     */
    public List<PassengerBaseCar> sortCars() {
        List<PassengerBaseCar> carsDuplicate = new ArrayList<>(cars);
        carsDuplicate.sort(Comparator.comparingInt(PassengerBaseCar::getComfortLevel));
        return carsDuplicate;
    }
}