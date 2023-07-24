package menu;

import lombok.Data;

import java.util.List;

@Data
public abstract class Menu {
    private String name;
    private List<String> ingredient;
    private Integer coast;

    public Menu() {
    }

    public Menu(String name, List<String> ingredient, Integer coast) {
        this.name = name;
        this.ingredient = ingredient;
        this.coast = coast;
    }
}
