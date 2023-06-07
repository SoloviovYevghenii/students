package homeworks.homework_3.vehicle.model;

import homeworks.homework_3.vehicle.interfaces.OffRoadCapable;
import homeworks.homework_3.vehicle.Car;

final public class SUV extends Car implements OffRoadCapable {
    private boolean fourWheelDrive;

    public SUV(String brand, int year, int numberOfDoors, String fuelType, boolean fourWheelDrive) {
        super(brand, year, numberOfDoors, fuelType);
        this.fourWheelDrive = fourWheelDrive;
    }

    @Override
    public void start() {
        System.out.println("Start SUV engine");
    }

    @Override
    public void stop() {
        System.out.println("Stop SUV engine");
    }

    public void enableFourWheelDrive() {
        System.out.println("Enable the 4-wheel drive on the SUV vehicle");
    }

    public void disableFourWheelDrive() {
        System.out.println("Disable the 4-wheel drive on the SUV vehicle");
    }

    @Override
    public void calculateFuelConsumption() {
        System.out.println("SUV fuel consumption: 13l/100km");
    }

    @Override
    public void calculateTravelDistanceWithCurrentFuel() {
        System.out.println("Calculating SUV travel distance");
    }
}
