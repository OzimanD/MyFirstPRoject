package OOP.L3Inheritance.ex001_inheritance;

/**
 * Успадкування.
 */
public class DerivedClass extends BaseClass {
    public int a = 8;
    // Конструктор.
    public DerivedClass() {
        // Змінюємо всі доступні поля успадковані від базового класу.
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
        a = 8;
    }
}
