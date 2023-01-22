package Demo.Polimorfism;

public class Dog extends Animal{
    @Override
    public void animalSound() {
        System.out.println("gaw gaw");
    }

    @Override
    public void moove() {
        System.out.println("run");
    }
}
