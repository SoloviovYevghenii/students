package homeworks.homework_3.device.device_type;

import homeworks.homework_3.device.Portable;

final public class MobilePhone extends Portable {
    private String networkType;
    private boolean hasFaceRecognition;

    public MobilePhone(String brand, String model, int batteryCapacity, String screenSize, String networkType, boolean hasFaceRecognition) {
        super(brand, model, batteryCapacity, screenSize);
        this.networkType = networkType;
        this.hasFaceRecognition = hasFaceRecognition;
    }

    @Override
    public void switchOn() {
        System.out.println("Switch on mobile phone");
    }

    @Override
    public void switchOff() {
        System.out.println("Switch off mobile phone");
    }

    public void makePhoneCall(String phoneNumber) {
        System.out.println("Calling: " + phoneNumber);
    }

    @Override
    public void checkBatteryLevel() {
        System.out.println("Battery level of mobile phone");
    }

    @Override
    public void connect() {
        System.out.println("Mobile phone is connected to network");
    }

    @Override
    public void disconnect() {
        System.out.println("Mobile phone is disconnected to network");
    }

    @Override
    public void configureWireless() {
        System.out.println("Mobile phone is configured to connection");
    }
}
