package OOP.L3Inheritance.animal;

public class Animal {
    private int weigh;
    private String brade;

    public Animal(int weigh, String brade) {
        this.weigh = weigh;
        this.brade = brade;
    }

    public Animal() {
    }

    public int getWeigh() {
        return weigh;
    }

    public void setWeigh(int weigh) {
        this.weigh = weigh;
    }

    public String getBrade() {
        return brade;
    }

    public void setBrade(String brade) {
        this.brade = brade;
    }

    public static String catsVoice(){
        String miau = "Мяууу";
        return miau;
    }
    public void method() {
        System.out.println("method from BaseClass");
    }

}
