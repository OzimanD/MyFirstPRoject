package OOP.L3Inheritance.ex002_inheritance;

/**
 * Успадкування.
 */
public class Main {
    public static void main(String[] args) {
        DerivedClass instance = new DerivedClass();

        System.out.println(instance.publicField);
        instance.show();
    }
}
