package com.driver;

//Car.java
public class Car {
    private String carNumber;
    private String carName;
    private boolean isAvailable;

    public Car(String carNumber, String carName, boolean isAvailable) {
        this.carNumber = carNumber;
        this.carName = carName;
        this.isAvailable = isAvailable;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public String getCarName() {
        return carName;
    }

    public boolean isAvailable() {
        return isAvailable;
    }

    public void setAvailable(boolean available) {
        isAvailable = available;
    }

    public static int getAvailableCars(Car[] cars) {
        int count = 0;
        for (Car car : cars) {
            if (car.isAvailable()) {
                count++;
            }
        }
        return count;
    }
}
