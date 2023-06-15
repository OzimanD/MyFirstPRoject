package OOP.L3Inheritance.ex001_inheritance;

/**
 * Успадкування.
 */
public class DerivedClass extends BaseClass {
    int c = 9;
    // Конструктор.
    public DerivedClass() {
        // Змінюємо всі доступні поля успадковані від базового класу.
        publicField = "DerivedClass.publicField";
        protectedField = "DerivedClass.protectedField";
        a = 8;
        b = 9;
    }

    public DerivedClass(int c) {
        this.c = c;
    }
}
