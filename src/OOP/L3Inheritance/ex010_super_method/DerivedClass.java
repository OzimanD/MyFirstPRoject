package OOP.L3Inheritance.ex010_super_method;

public class DerivedClass extends BaseClass {
    // Перевизначення методу базового класу.

    @Override
    public void method() {
        // Виклик методу базового класу.
        super.method();

        System.out.println("method from DerivedClass");
    }
}