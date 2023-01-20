package OOP.L3Inheritance.ex009_interface_inheritance;

/**
 * Успадкування.
 */
public class SomeClass implements SomeInterface1, SomeInterface2, SomeInterface3 {
    public void method1() {
        System.out.println("met1");
    }

    public void method2() {
        System.out.println("met2");
    }

    public void method3() {
        System.out.println("met3");
    }
}
