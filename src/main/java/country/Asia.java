package country;



public class Asia extends Nationality implements Location {
    private  int number;

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int one() {
        return 6;
    }

    @Override
    public int getLastName() {
        return 49;
    }
}
