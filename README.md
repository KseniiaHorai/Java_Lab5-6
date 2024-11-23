# Lab5: Inheritance and Polymorphism

## Objective
Learn the concepts of inheritance and polymorphism in Java. Understand the principles of class hierarchies and the application of these concepts to create flexible and reusable code.

## Task
**Variant 7**

- Define the hierarchy for railway transport. Create a passenger train. Calculate the total number of passengers and bags in the train. Sort the train cars by comfort level. Find the car in the train that matches a given range of the number of passengers.
---

## Implementation Details

## Class and Implementation Details

### Class Design

- **BaseCar Class**: A base class for representing the basic properties of a car (e.g., number, capacity).
- **PassengerBaseCar Class**: A subclass of **BaseCar**, responsible for managing passenger counts and bags.
- **CoachCar, BusinessCar, FirstClassCar Classes**: These are specific subclasses of **PassengerBaseCar** representing different types of cars based on comfort and capacity.
- **Train Class**: Represents a train composed of various car objects. The class includes methods for calculating the total number of passengers and bags, as well as sorting cars by comfort level.

### Coding Standards
The code will adhere to Java Code Conventions (or Google Java Style Guide) to ensure readability and maintainability.

---

## Getting Started
To get started with this project:
1. Clone the repository to your local machine.
2. Open the project in your preferred Java IDE (e.g., IntelliJ IDEA, Eclipse).
3. Run the program:
```cmd
  mvn clean install
  java -cp target/Lab5_Horai-1.0-SNAPSHOT.jar org.example.Main
```
