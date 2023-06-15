package OOP.L4abstractionsandInterfaces.abstraction.ex001_abstraction;

/**
 * Абстрактний клас.
 */
interface Interface {
    void method();
}

class MyClass implements Interface {
    public void method() {
        System.out.println("Method - realizaciya Interface.");
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass my = new MyClass();

        my.method();
    }
}
