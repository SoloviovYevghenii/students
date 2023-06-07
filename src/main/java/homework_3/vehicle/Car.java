package homeworks.homework_3.vehicle;

import homeworks.homework_3.vehicle.interfaces.FuelConsumption;

abstract public class Car extends Vehicle implements FuelConsumption {
    private int numberOfDoors;
    private String fuelType;

    public Car(String brand, int year, int numberOfDoors, String fuelType) {
        super(brand, year);
        this.numberOfDoors = numberOfDoors;
        this.fuelType = fuelType;
    }

    @Override
    public void start() {
        System.out.println("Start engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop engine");
    }

    public void openDoor() {
        System.out.println("Open the car door");
    }

    public void refuel() {
        System.out.println("Refuel the car with fuel");
    }

}
