package homeworks.homework_3.device;

import homeworks.homework_3.device.interfaces.Connectable;

abstract public class Device implements Connectable {
    private String brand;
    private String model;

    public Device(String brand, String model) {
        this.brand = brand;
        this.model = model;
    }

    public abstract void switchOn();

    public abstract void switchOff();
}
