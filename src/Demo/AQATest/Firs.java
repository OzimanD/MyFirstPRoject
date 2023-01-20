package Demo.AQATest;

public class Firs {
    String name;
    String surname;
    String LOL;
    int age;

    public Firs(String name, String surname, int age) {
        this.name = name;
        this.surname = surname;
        this.age = age;
    }

    public Firs(String name, String surname) {
        this.name = name;
        this.surname = surname;
        age = 9;
    }

    public Firs() {
        name = "name";
        surname = "surname";
        age = 18;
    }

    public Firs(String name, String surname, String LOL) {
        this.name = name;
        this.surname = surname;
        this.LOL = LOL;
    }
    public void Meth(){
        System.out.println("Met");
    }

    private void metPr(){
        System.out.println(1);
    }


}
