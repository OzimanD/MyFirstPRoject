package OOP.L3Inheritance.animal;

public class Cat extends Animal  {
    int age;
    String name;

    Cat(int age, String name, int weigh, String brade){
        super(weigh, brade);
        this.age = age;
        this.name = name;
    }

}
