package Demo.Interfaces;

public class Dog implements Animal{
    @Override
    public void animalSound() {
        System.out.println("Gaw gaw");
    }

    @Override
    public void run() {
        System.out.println("Move on");
    }
}
