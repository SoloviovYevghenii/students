package staff;

import lombok.Data;
import menu.FoodMenu;

import java.util.List;

@Data
public class Chef extends Employee{

    public Chef(String name, String surname) {
        super(name, surname);
    }
}
