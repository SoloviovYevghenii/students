import menu.BarMenu;
import menu.FoodMenu;
import restoran.Client;
import java.util.List;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) throws InterruptedException {

// клиет сел за стол.
        Client client = new Client();
        client.setStolNumber(2);

//         выбор напитка
        BarMenu barMenu = new BarMenu();

        List<BarMenu> menusBar = barMenu.getMenu();
        // выводим меню бар
        getBarMenu(barMenu);
        Scanner scant = new Scanner(System.in);
      //получаем ответ от пользователя
        String bar = scant.next();
        // сортировка по цене
        menusBar.sort((BarMenu s1 , BarMenu s2 )-> {
            return s1.getCoast().compareTo(s2.getCoast());
        });
        billsMenuBar(menusBar,client, bar);
//        выбрали напитое
        FoodMenu foodMen = new FoodMenu();
        List<FoodMenu> menuFood = foodMen.getFodMenu();

//        выводим меню
        getFoodMenu(foodMen);
        String food = scant.next();
        menuFood.sort((FoodMenu s1 , FoodMenu s2 )-> s1.getCoast().compareTo(s2.getCoast()));

         billsMenu(menuFood,client, food);
        System.out.println("несет еду");
        Thread.sleep(100);

        System.out.println("Принести счет");
        Thread.sleep(100);
        //получаем ответ от пользователя из консоли
        String beeld = scant.next();
        // пользователь ввел ок  чтоб принесои счет
        if ("OK".equalsIgnoreCase(beeld)) {
            int bild = client.getFoodMenu().getCoast() + client.getBarMenu().getCoast();
            System.out.println("ваш счет  =" + bild);
        }
        //получаем ответ от пользователя из консоли
        else if("menu".equals(beeld)) {
            getBarMenu(barMenu);
            String barNew = scant.next();
            billsMenuBar(menusBar,client, barNew);

            getFoodMenu(foodMen);
            String foodMenu = scant.next();
            billsMenuBar(menusBar, client, foodMenu);
            Thread.sleep(100);
            int bild = client.getFoodMenu().getCoast() + client.getBarMenu().getCoast();
            System.out.println("ваш счет  =" + bild);
        }
    }

    private static void getBarMenu( BarMenu barMenu){
        for (BarMenu one : barMenu.getMenu()) {
            System.out.println("Название " + one.getName());
            System.out.println("Ингр = " + one.getIngredient());
            System.out.println("Цена = " + one.getCoast());
        }
        System.out.println("Выберите напиток");
    }

    private static void getFoodMenu( FoodMenu foodMen ){
        for (FoodMenu one : foodMen.getFodMenu()) {
            System.out.println("Название " + one.getName());
            System.out.println("Ингр = " + one.getIngredient());
            System.out.println("Цена = " + one.getCoast());
        }
        System.out.println("Выберите еду");
    }

    private static void billsMenuBar(List<BarMenu> menusBar, Client client,String bar){
        menusBar.stream().forEach(one -> {
                    if (one.getName().equals(bar)) {
                        client.setBarMenu(one);
                    }
                }
        );
    }

    private static void billsMenu( List<FoodMenu> menuFood, Client client, String food){
        menuFood.stream().forEach(one -> {
            if (one.getName().equals(food)) {
                client.setFoodMenu(one);
            }
        });
    }
}
