package restoran;

import lombok.Data;
import menu.BarMenu;
import menu.FoodMenu;

@Data
public class Client {

    private int stolNumber;
    private BarMenu barMenu;
    private FoodMenu foodMenu;
    private Order order;
}
