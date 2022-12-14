package OOP.L4abstractionsandInterfaces.interfaces.ex003_interfaces;

/**
 * Множинне успадкування від одного класу та кількох інтерфейсів.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();
        instance.method();
        instance.method1();
        instance.method2();

        System.out.println("-----------------------------");

        BaseClass instance0 = (BaseClass)instance;
        instance0.method();

        Interface1 instance1 = (Interface1)instance;
        instance1.method1();

        Interface2 instance2 = (Interface2)instance;
        instance2.method2();
    }
}
