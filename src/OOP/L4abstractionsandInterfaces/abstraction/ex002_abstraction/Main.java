package OOP.L4abstractionsandInterfaces.abstraction.ex002_abstraction;

/**
 * Конкретний клас A.
 */
class ConcreteClassA {
    public void operation() {
        System.out.println("ConcreteClassA.operation");
    }
}

/**
 * Абстрактний клас.
 */
abstract class AbstractClass extends ConcreteClassA {
    public abstract void method();
}

/**
 * Конкретний клас B.
 */
class ConcreteClassB extends AbstractClass {
    @Override
    public void method() {
        System.out.println("ConcreteClassB.method");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClassB();

        instance.method();
        instance.operation();
    }
}
