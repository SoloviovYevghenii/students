

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class BarMenu {

private  Menu menu;

    public Menu getMenu() {
        return menu;
    }

    public void setMenu( Menu menu) {
        this.menu = menu;
    }

    public List<Menu> getBarMenu(){
        List<Menu> menus = new ArrayList<>();
        Menu wine = new Menu("wine", List.of("wine yeast", "Wine stabilizers","Additives for viticulture"), 29, true);
        menus.add(wine);
        Menu vodka = new Menu("vodka", List.of("water", " alcohol"), 16, true);
        menus.add(vodka);
        return menus;


    }
}
