package OOP.L5nestedclasess.static_members.ex005_constructors;

public class NotStaticClass {
    // Контруктор екземпляру викликається тільки при створенні екземпляра класу.
    public NotStaticClass() {
        System.out.println("Constructor.");
    }

    // Статичний блок викликається у будь-якому випадку,
    // як із зверненні до статичного члену, і під час створення екземпляру класу.
    static {
        System.out.println("Static block.");
    }

    // Статичний метод.
    public static void staticMethod() {
        System.out.println("staticMethod");
    }

    public void notStaticMethod() {
        System.out.println("notStaticMethod");
    }
}
