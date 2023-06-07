package homeworks.homework_3.vehicle.model;

import homeworks.homework_3.vehicle.Car;

final public class Sedan extends Car {
    private int trunkCapacity;

    public Sedan(String brand, int year, int numberOfDoors, String fuelType, int trunkCapacity) {
        super(brand, year, numberOfDoors, fuelType);
        this.trunkCapacity = trunkCapacity;
    }

    @Override
    public void start() {
        System.out.println("Start sedan engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop sedan engine");
    }

    public void openTrunk() {
        System.out.println("Opening the trunk of the sedan");
    }

    public void closeTrunk() {
        System.out.println("Closing the trunk of the sedan");
    }

    @Override
    public void calculateFuelConsumption() {
        System.out.println("Sedan fuel consumption: 7l/100km");
    }

    @Override
    public void calculateTravelDistanceWithCurrentFuel() {
        System.out.println("Calculating Sedan travel distance");
    }
}
