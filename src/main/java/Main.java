import animal.Monkey;
import country.Asia;
import country.Europe;

public class Main {

    public static void main(String[] args) {
        Monkey monkey = new Monkey();
        monkey.setAlive(true);

        Europe europe = new Europe();
        europe.setGender("women");

        Asia asia = new Asia();
        asia.setNumber(21);

        QuantityImpl quantity = new QuantityImpl();
        Wiew wiew = new WiewImpl();


    }

}

