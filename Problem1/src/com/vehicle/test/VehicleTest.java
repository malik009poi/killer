package com.vehicle.test;

import com.vehicle.Car;
import com.vehicle.ElectricCar;

public class VehicleTest {
   public static void main(String[] args) {
      // Create a Car instance
      Car car = new Car();
      car.setSpeed(120.0);
      car.setFuelLevel(100.0f);
      car.drive(2000); // Drive 2000 meters (2 km)

      // Display the car information
      System.out.println("Car speed in MPH IS:"+ " " + car.getSpeedMph());
      System.out.println("Car distance traveled in KM IS:"+ " " + car.getDistanceKm());
      System.out.println("Remaining fuel IS:"+" " + car.calculateRemainingFuel(2.0)); // Use 2 km explicitly

      // Create an ElectricCar instance
      ElectricCar electricCar = new ElectricCar();
      electricCar.setSpeed(100.0); // Set the speed for ElectricCar
      electricCar.setFuelLevel(100.0f);
      electricCar.setBatteryLevel(100.0);
      electricCar.drive(5000); // Drive 5000 meters (5 km)

      // Display the electric car information
      System.out.println("Electric Car speed in MPH IS:"+ " " + electricCar.getSpeedMph());
      System.out.println("Electric Car distance traveled in KM IS:"+ " " + electricCar.getDistanceKm());
      System.out.println("Remaining fuel IS:"+ " " + electricCar.calculateRemainingFuel(5.0)); // Use 5 km explicitly
      System.out.println("Remaining battery IS:"+ " " + electricCar.getBatteryLevel());
   }
}
