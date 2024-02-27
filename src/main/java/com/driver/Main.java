package com.driver;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // Create an array of cars
        Car[] cars = {
                new Car("ABC123", "Toyota Camry", true),
                new Car("XYZ789", "Honda Accord", true),
                new Car("DEF456", "Ford Mustang", true),
        };

        System.out.println("Available Cars: " + Car.getAvailableCars(cars));
        rentCar(cars);
        System.out.println("Available Cars: " + Car.getAvailableCars(cars));
    }

    private static void rentCar(Car[] cars) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the car number to rent:");
        String carNumberToRent = scanner.next();

        for (Car car : cars) {
            if (car.getCarNumber().equals(carNumberToRent)) {
                if (car.isAvailable()) {
                    // Rent the car
                    car.setAvailable(false);
                    System.out.println("You have rented the car: " + car.getCarName());
                } else {
                    System.out.println("Sorry, the selected car is not available for rent.");
                }
                return;
            }
        }
        System.out.println("Car with number " + carNumberToRent + " not found.");
    }
}
