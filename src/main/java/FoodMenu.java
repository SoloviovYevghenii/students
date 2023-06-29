import lombok.Data;

import java.util.ArrayList;
import java.util.List;


@Data
public class FoodMenu {

    private Menu menu;

    public List<Menu> getFodMenu() {
        List<Menu> menus = new ArrayList<>();
        Menu pure = new Menu("pure", List.of("potato", "oil"), 25);
        menus.add(pure);
        Menu fishSoup = new Menu("fishSoup", List.of("fish", "seasoning", "potato"), 20);
        menus.add(fishSoup);
        Menu cutlets = new Menu("cutlets", List.of("groundMeat", "seasoning"), 10);
        menus.add(cutlets);
        Menu frenchFries = new Menu("frenchFries", List.of("potato", "seasoning", "potato"), 15);
        menus.add(frenchFries);
        return menus;

    }


}
