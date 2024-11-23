package org.example;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class MyTrain {

    public final List<PassengerBaseCar> cars;

    public MyTrain(List<PassengerBaseCar> cars) {
        this.cars = cars;
    }

    public List<Integer> calculateTotalPassengersAndBags() {
        int totalPassengers = 0;
        int totalBags = 0;

        for (PassengerBaseCar car : cars) {
            totalPassengers += car.getPassengerCount();
            totalBags += car.getBagsCount();
        }

        return List.of(totalPassengers, totalBags);
    }

    public List<PassengerBaseCar> sortCars() {
        List<PassengerBaseCar> carsDuplicate = new ArrayList<>(cars);
        carsDuplicate.sort(Comparator.comparingInt(PassengerBaseCar::getComfortLevel));
        return carsDuplicate;
    }
}
