package OOP.L3Inheritance.ex002_inheritance;

/**
 * Успадкування.
 */
public class BaseClass {
    // Поля
    public String publicField = "BaseClass.publicField";
    private String privateField = "BaseClass.privateField";
    protected String protectedField = "BaseClass.protectedField";

    // Метод
    public void show() {
        System.out.println(privateField);
    }
}
