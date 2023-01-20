package OOP.L3Inheritance.animal;


public class Main extends Cat {


    Main(int age, String name, int weigh, String brade) {
        super(age, name, weigh, brade);
    }

    public static void main(String[] args) {



    Cat c = new Cat(5,"Marsel",7,"Drorr Terier");
        System.out.println(c.getBrade()+" "+c.getWeigh()+" "+c.name+" "+c.age);
        System.out.println();
    }
}
