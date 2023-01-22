package Demo.Polimorfism;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        Pig pig = new Pig();
        Lastivka lastivka = new Lastivka();
        animal.animalSound();
        dog.animalSound();
        pig.animalSound();
//        animal.moove();
        dog.moove();
        pig.moove();
        lastivka.animalSound();
        lastivka.moove();

    }
}
