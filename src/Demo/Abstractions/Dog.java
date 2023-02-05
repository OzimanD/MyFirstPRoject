package Demo.Abstractions;

public class Dog extends ClassAbsAnimal {
    @Override
    public void animalSound() {
        super.notAbsMet();
        System.out.println("gaw gaw");
    }
}
