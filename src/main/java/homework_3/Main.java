package homeworks.homework_3;

import homeworks.homework_3.device.Portable;
import homeworks.homework_3.device.device_type.Laptop;
import homeworks.homework_3.device.device_type.MobilePhone;
import homeworks.homework_3.device.device_type.Tablet;
import homeworks.homework_3.vehicle.Vehicle;
import homeworks.homework_3.vehicle.model.SUV;
import homeworks.homework_3.vehicle.model.Sedan;
import homeworks.homework_3.vehicle.model.SportsCar;

public class Main {
    public static void main(String[] args) {
        //device
        Laptop laptop = new Laptop("Asus", "X710", 7500, "13\"", 500, false);
        laptop.performMultitasking();
        laptop.switchOff();

        Portable nokia = new MobilePhone("Nokia", "3310", 800, "3\"", "GSM", false);
        nokia.switchOn();
        nokia.checkBatteryLevel();
        nokia.adjustScreenBrightness(100);
        nokia.connect();
        nokia.disconnect();
        nokia.switchOff();

        MobilePhone samsung = new MobilePhone("Samsung", "S22", 4500, "7\"", "4G", true);
        samsung.makePhoneCall("911");
        samsung.switchOff();

        Portable oldTablet = new Tablet("Samsung", "Galaxy 7", 3000, "7\"", false, false);
        oldTablet.switchOn();
        oldTablet.connect();
        oldTablet.checkBatteryLevel();
        oldTablet.disconnect();
        oldTablet.adjustScreenBrightness(20);
        oldTablet.switchOff();

        Tablet ipad = new Tablet("Apple", "Air 5", 5000, "9.5\"", false, false);
        ipad.takeNotes();
        ipad.switchOff();

        //vehicle
        Sedan vw = new Sedan("VW", 2023, 4, "diesel", 100);
        vw.start();
        vw.calculateFuelConsumption();
        vw.brake();
        vw.openTrunk();
        vw.closeTrunk();
        vw.stop();
        vw.openDoor();

        Vehicle oldCar = new SUV("VW", 1985, 3, "diesel", true);
        oldCar.start();
        oldCar.accelerate();
        oldCar.brake();
        oldCar.stop();

        SUV bmw = new SUV("BMW", 2020, 5, "petrol", true);
        bmw.start();
        bmw.calculateTravelDistanceWithCurrentFuel();
        bmw.refuel();
        bmw.openDoor();
        bmw.enableFourWheelDrive();
        bmw.disableFourWheelDrive();
        bmw.stop();

        SportsCar pontiac = new SportsCar("Pontiac", 1980, 2, "petrol", "automatic");
        pontiac.accelerate();
        pontiac.enableNitrous();
        pontiac.disableNitrous();
        pontiac.brake();
        pontiac.stop();
    }
}
