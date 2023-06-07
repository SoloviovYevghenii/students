package homeworks.homework_3.device.device_type;

import homeworks.homework_3.device.Portable;

final public class Laptop extends Portable {
    private int storageCapacity;
    private boolean hasBacklitKeyboard;

    public Laptop(String brand, String model, int batteryCapacity, String screenSize, int storageCapacity, boolean hasBacklitKeyboard) {
        super(brand, model, batteryCapacity, screenSize);
        this.storageCapacity = storageCapacity;
        this.hasBacklitKeyboard = hasBacklitKeyboard;
    }

    @Override
    public void switchOn() {
        System.out.println("Switch on laptop");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off laptop");
    }

    public void performMultitasking() {
        System.out.println("Opening several windows");
    }

    @Override
    public void checkBatteryLevel() {
        System.out.println("Laptop level of tablet");
    }

    @Override
    public void connect() {
        System.out.println("Laptop is connected to network");
    }

    @Override
    public void disconnect() {
        System.out.println("Laptop is disconnected to network");
    }

    @Override
    public void configureWireless() {
        System.out.println("Laptop is configured to connection");
    }
}
