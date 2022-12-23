package OOP.L4abstractionsandInterfaces.interfaces.ex008_interfaces;

/**
 * Наследование от класса и интерфейса у которых совпадают сигнатуры членов.
 */
interface Interface {
    void method();
}

class BaseClass {
    public void method() {
        System.out.println("BaseClass.method()");
    }
}

class DerivedClass extends BaseClass implements Interface {
    // Реалізація інтерфейсу не є обов'язковою, т.к. сигнатури методів у класі та інтерфейсі збігаються.
}

public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();

        Interface instance1 = (Interface) instance;
        instance1.method();
    }
}
