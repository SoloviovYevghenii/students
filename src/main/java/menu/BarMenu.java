package menu;

import lombok.Data;
import lombok.ToString;

import java.util.ArrayList;
import java.util.List;

@Data

public class BarMenu extends Menu {

    private  boolean isAlcogol;

    public BarMenu() {
    }


    public List<BarMenu> getMenu(){
        List<BarMenu> menus = new ArrayList<>();

        BarMenu wine = new BarMenu();
        wine.setName("wine");
        wine.setCoast(29);
        wine.setAlcogol(true);
        wine.setIngredient( List.of("wine yeast", "Wine stabilizers","Additives for viticulture"));
        menus.add(wine);

        BarMenu vodka = new BarMenu();
        vodka.setCoast(16);
        vodka.setName("vodka");
        vodka.setIngredient( List.of("water", " alcohol"));
        menus.add(vodka);

        BarMenu vodka2 = new BarMenu();
        vodka2.setCoast(40);
        vodka2.setName("vodka");
        vodka2.setIngredient( List.of("water", " alcohol"));
        menus.add(vodka2);

        return menus;
    }

    @Override
    public String toString() {
        return "BarMenu{" +
                "isAlcogol=" + isAlcogol +
                '}';
    }
}
