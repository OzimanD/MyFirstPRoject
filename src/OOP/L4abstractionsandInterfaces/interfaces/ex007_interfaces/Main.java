package OOP.L4abstractionsandInterfaces.interfaces.ex007_interfaces;

/**
 * Успадкування абстрактних класів від інтерфейсів.
 */
interface Interface {
    void method();
}

abstract class AbstractClass implements Interface {
    //  Перезапис абстрактного методу з інтерфейсу в абстрактному класі не обов'язковий.
    public abstract void method();
}

class ConcreteClass extends AbstractClass {
    // Реалізація абстрактного методу з абстрактного класу у конкретному класі обов'язкова.
    public void method() {
        System.out.println("Method - realizacuya interface v abstraktnom classe.");
    }
}

public class Main {
    public static void main(String[] args) {
        ConcreteClass instance = new ConcreteClass();
        instance.method();
    }
}
