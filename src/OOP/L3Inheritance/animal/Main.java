package OOP.L3Inheritance.animal;

public class Main extends Cat {
    public static void main(String[] args) {
        Cat cat = new Cat();
        Animal animal = new Animal();
        System.out.println(cat.catsVoice());
        System.out.println(animal.catsVoice());
        animal.catsVoice();


//    Cat c = new Cat(5,"Marsel",7,"Drorr Terier");
//        System.out.println(c.getBrade()+" "+c.getWeigh()+" "+c.name+" "+c.age);
//        System.out.println();
//        System.out.println(catsVoice());
    }
}
