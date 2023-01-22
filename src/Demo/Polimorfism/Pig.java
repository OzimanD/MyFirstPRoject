package Demo.Polimorfism;

public class Pig extends Animal{
    @Override
    public void animalSound() {
        System.out.println("we we");
    }

    @Override
    public void moove() {
        super.moove();
        System.out.println("run");
    }
}
