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
	//your code goes here
     return carNumber;
 }

 public String getCarName() {
	//your code goes here
     return carName;
 }

 public boolean isAvailable() {
	//your code goes here
     return isAvailable;
 }

 public void setAvailable(boolean available) {
	//your code goes here
     isAvailable = available;
 }

 public static int getAvailableCars(Car[] cars) {
	//your code goes here
	 int count = 0;
     return count;
 }
}

