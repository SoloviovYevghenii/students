

import lombok.Data;

import java.util.List;

@Data
public class Menu {
    private String name;
    private List<String> ingredient;
    private Integer coast;

    private boolean isAlcoholicDrinks;

    public Menu() {
    }

    public Menu(String name, List<String> ingredient, Integer coast) {
        this.name = name;
        this.ingredient = ingredient;
        this.coast = coast;
    }

    public Menu(String name, List<String> ingredient, Integer coast, boolean isAlcoholicDrinks) {
        this.name = name;
        this.ingredient = ingredient;
        this.coast = coast;
        this.isAlcoholicDrinks = isAlcoholicDrinks;
    }

}
