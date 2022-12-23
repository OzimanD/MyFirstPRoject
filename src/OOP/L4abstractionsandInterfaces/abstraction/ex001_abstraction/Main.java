package OOP.L4abstractionsandInterfaces.abstraction.ex001_abstraction;

/**
 * Абстрактний клас.
 */
abstract class AbstractClass {
    public abstract void method();
}

/**
 * Конкретний клас.
 */
class ConcreteClass extends AbstractClass {
    public void method() {
        System.out.println("Implementation");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        instance.method();
    }
}
