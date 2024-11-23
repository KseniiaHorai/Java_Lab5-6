package org.example;

import org.example.PassengerBaseCar;
import org.example.CoachCar;
import org.example.FirstClassCar;
import org.example.BusinessCar;
import org.example.BaseCar;

import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        List<PassengerBaseCar> cars = createTrain();
        MyTrain train = new MyTrain(cars);
        System.out.println("UNSORTED CARS:");
        printCars(train.cars);

        List<Integer> totalPassengersAndBags = train.calculateTotalPassengersAndBags();
        System.out.println("NUMBER OF PASSENGERS: " + totalPassengersAndBags.get(0));
        System.out.println("NUMBER OF BAGS: " + totalPassengersAndBags.get(1));

        System.out.println("SORT CARS - COMFORT:");
        List<PassengerBaseCar> comfortCars = train.sortCars();
        printCars(comfortCars);
    }

    private static void printCars(List<PassengerBaseCar> cars) {
        for (PassengerBaseCar car : cars) {
            System.out.println(car);
        }
    }

    private static List<PassengerBaseCar> createTrain() {

        CoachCar car1Coach = new CoachCar(45, 50);
        BusinessCar car2Business = new BusinessCar(20, 23);
        FirstClassCar car3FirstClass = new FirstClassCar(10, 9);
        BusinessCar car4FirstClass = new BusinessCar(38, 45);
        FirstClassCar car5FirstClass = new FirstClassCar(5, 5);
        CoachCar car6Coach = new CoachCar(155, 200);

        List<PassengerBaseCar> testCars = new ArrayList<>();
        testCars.add(car1Coach);
        testCars.add(car2Business);
        testCars.add(car3FirstClass);
        testCars.add(car4FirstClass);
        testCars.add(car5FirstClass);
        testCars.add(car6Coach);

        return testCars;
    }
}
