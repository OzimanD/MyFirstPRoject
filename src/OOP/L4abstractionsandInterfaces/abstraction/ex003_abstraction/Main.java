package OOP.L4abstractionsandInterfaces.abstraction.ex003_abstraction;

/**
 * Абстрактний клас може бути успадкований від абстрактного класу.
 * Реалізація абстрактного методу з базового абстрактного класу, у похідному абстрактному класі – не є обов'язковою.
 */

/**
 * Абстрактний клас A.
 */
abstract class AbstractClassA {
    public abstract void operationA();
}

/**
 * Абстрактний клас B.
 */
abstract class AbstractClassB extends AbstractClassA {
    public abstract void operationB();
}

/**
 * Конкретний клас.
 */
class ConcreteClass extends AbstractClassB {
    @Override
    public void operationA() {
        System.out.println("ConcreteClass.operationA");
    }

    @Override
    public void operationB() {
        System.out.println("ConcreteClass.operationB");
    }
}

public class Main {
    public static void main(String[] args) {
        AbstractClassA instance = new ConcreteClass();

        instance.operationA();

//        instance.operationB();  // Питання: чому недоступний цей метод?
        AbstractClassB instance1 = new ConcreteClass();

        instance1.operationB();
        instance1.operationA();

    }
}
