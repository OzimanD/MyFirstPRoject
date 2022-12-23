package OOP.L4abstractionsandInterfaces.abstraction.ex005_abstraction;

public abstract class AbstractBaseClass {
    // 1.
    // Метод передається похідному класу як за успадкування від конкретного класу.
    public void simpleMethod() {
        System.out.println("AbstractBaseClass.simpleMethod");
    }

    // 2.
    // Абстрактний метод - реалізується у похідному класі.
    abstract public void abstractMethod();
}
