package animal;

public class Monkey extends Primate {

    public  String getVoice(){
        return "animal.Monkey";
    }

    private String diet;

    public String getDiet() {
        return diet;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }
}
