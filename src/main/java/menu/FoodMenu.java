package menu;

import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.List;


@Data
@NoArgsConstructor
public class FoodMenu extends Menu {

    public FoodMenu(String name, List<String> ingredient, Integer coast) {
        super(name, ingredient, coast);
    }

    public List<FoodMenu> getFodMenu() {
        List<FoodMenu> menus = new ArrayList<>();
        FoodMenu pure = new FoodMenu("pure", List.of("potato", "oil"), 25);
        menus.add(pure);
        FoodMenu fishSoup = new FoodMenu("fishSoup", List.of("fish", "seasoning", "potato"), 20);
        menus.add(fishSoup);
        FoodMenu cutlets = new FoodMenu("cutlets", List.of("groundMeat", "seasoning"), 10);
        menus.add(cutlets);
        FoodMenu frenchFries = new FoodMenu("frenchFries", List.of("potato", "seasoning", "potato"), 15);
        menus.add(frenchFries);
        return menus;

    }


}
