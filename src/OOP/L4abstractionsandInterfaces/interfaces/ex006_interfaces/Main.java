package OOP.L4abstractionsandInterfaces.interfaces.ex006_interfaces;

/**
 * Успадкування абстрактних класів від інтерфейсів.
 */
interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    // Реалізація абстрактного методу з інтерфейсу в абстрактному класі не обов'язкова.
    public void method() {
        System.out.println("Method - realizacuya interface v abstraktnom classe.");
    }
}

class ConcreteClass extends AbstractClass {
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
