package OOP.L5nestedclasess.static_members.ex006_abstract_class;

public abstract class AbstractClass {
    // Статичний фабричний метод.
    public static AbstractClass CreateObject() {
        return new ConcreteClass();
    }

    public abstract void Method();
}

