package Demo.Interfaces;

public class Pig implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Wewe");
    }

    @Override
    public void run() {
        System.out.println("move on");
    }
}
