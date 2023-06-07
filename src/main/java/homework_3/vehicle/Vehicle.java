package homeworks.homework_3.vehicle;

import homeworks.homework_3.vehicle.interfaces.Drivable;

abstract public class Vehicle implements Drivable {
    private String brand;
    private int year;

    public Vehicle(String brand, int year) {
        this.brand = brand;
        this.year = year;
    }

    public abstract void start();

    public abstract void stop();

    public void accelerate() {
        System.out.println("Accelerating the vehicle");
    }

    public void brake() {
        System.out.println("The vehicle is braking");
    }
}
