package OOP.L4abstractionsandInterfaces.abstraction.ex006_abstraction;

abstract class AbstractClass {
    // Конструктор (відпрацьовує першим).
    public AbstractClass() {
        System.out.println("1 AbstractClass()");

        // Викликається реалізація методу з похідного класу - ConcreteClass.
        this.abstractMethod();

        System.out.println("2 AbstractClass()");
    }

    public abstract void abstractMethod();
}

class ConcreteClass extends AbstractClass {
    String s = "FIRST";

    // Конструктор (відпрацьовує другим).
    public ConcreteClass() {
        System.out.println("3 ConcreteClass()");
        s = "SECOND";
    }

    @Override
    public void abstractMethod() {
        System.out.println("Realizacuya methoda abstractMethod() v ConcreteClass  " + s);
    }
}
public class Main {
    public static void main(String[] args) {
        AbstractClass instance = new ConcreteClass();

        System.out.println("-------------------------------");

        instance.abstractMethod();
    }
}
