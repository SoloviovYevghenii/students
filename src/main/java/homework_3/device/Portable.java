package homeworks.homework_3.device;

import homeworks.homework_3.device.interfaces.BatteryPowered;
import homeworks.homework_3.device.interfaces.WirelessConnectable;

abstract public class Portable extends Device implements WirelessConnectable, BatteryPowered {
    private int batteryCapacity;
    private String screenSize;


    public Portable(String brand, String model, int batteryCapacity, String screenSize) {
        super(brand, model);
        this.batteryCapacity = batteryCapacity;
        this.screenSize = screenSize;
    }

    public void checkBatteryStatus() {
        System.out.println("Battery: " + batteryCapacity + "%");
    }

    public void adjustScreenBrightness(int brightnessLevel) {
        System.out.println("Screen Brightness: " + brightnessLevel);
    }
}
