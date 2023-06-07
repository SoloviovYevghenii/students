package homeworks.homework_3.device.device_type;

import homeworks.homework_3.device.Portable;

final public class Tablet extends Portable {
    private boolean hasStylus;
    private boolean isWaterproof;

    public Tablet(String brand, String model, int batteryCapacity, String screenSize, boolean hasStylus, boolean isWaterproof) {
        super(brand, model, batteryCapacity, screenSize);
        this.hasStylus = hasStylus;
        this.isWaterproof = isWaterproof;
    }

    @Override
    public void switchOn() {
        System.out.println("Switch on tablet");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off tablet");
    }

    public void takeNotes() {
        System.out.println("Some notes on tablet");
    }

    @Override
    public void checkBatteryLevel() {
        System.out.println("Battery level of tablet");
    }

    @Override
    public void connect() {
        System.out.println("Tablet is connected to network");
    }

    @Override
    public void disconnect() {
        System.out.println("Tablet is disconnected to network");
    }

    @Override
    public void configureWireless() {
        System.out.println("Tablet is configured to connection");
    }
}
