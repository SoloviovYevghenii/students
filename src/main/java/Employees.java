public class Employees {
    private final String firstName ="fesfs";
    private final String patronymic ="sfgs";
    private final String lastName = "sefg";
    private String position ;
    private String email;
    private int age;
    private int wages;

    public Employees() {
    }

    public Employees(String position, String email, int age, int wages) {
        this.position = position;
        this.email = email;
        this.age = age;
        this.wages = wages;
    }

    public Employees(int wages) {
        this.wages = wages;
    }
}




//2 Створити клас "Співробітник" з полями: ім'я, c, по-батькові - ці три зробити final, посада, email, телефон, вік, заробітня платня.