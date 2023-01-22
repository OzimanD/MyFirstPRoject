package Demo.Polimorfism;

public class Lastivka extends Animal {

    @Override
    public void animalSound() {
        System.out.println("shebeche");
    }

    @Override
    public void moove() {
        super.moove();
        System.out.println("fly");
    }
}
