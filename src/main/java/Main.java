import first.SameName;
import first.SameName2;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        SameName sameName = new SameName();
        SameName2 sameName2 = new SameName2();

        second.SameName sameNameSecond = new second.SameName();

        Car car = new Car();
        car.start();

        Employees employees = new Employees();
        Employees employees1 = new Employees("position","email",5,4);
        Employees employees2 = new Employees(4524);

    }

}

