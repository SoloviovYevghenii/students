package homeworks.homework_3.vehicle.model;

import homeworks.homework_3.vehicle.Car;

final public class SportsCar extends Car {
    private String transmissionType;

    public SportsCar(String brand, int year, int numberOfDoors, String fuelType, String transmissionType) {
        super(brand, year, numberOfDoors, fuelType);
        this.transmissionType = transmissionType;
    }

    public void enableNitrous() {
        System.out.println("Nitrous is enabled");
    }

    public void disableNitrous() {
        System.out.println("Nitrous is disabled");
    }

    @Override
    public void start() {
        System.out.println("Start sports car engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop sports car engine");
    }

    public void accelerate() {
        System.out.println("Accelerating sports car");
    }

    public void decelerate() {
        System.out.println("Decelerating sports car");
    }

    @Override
    public void calculateFuelConsumption() {
        System.out.println("Sports car fuel consumption: 30l/100km");
    }

    @Override
    public void calculateTravelDistanceWithCurrentFuel() {
        System.out.println("Calculating Sports car travel distance");
    }
}
