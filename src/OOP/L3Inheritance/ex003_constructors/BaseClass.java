package OOP.L3Inheritance.ex003_constructors;

/**
 * Успадкування.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор за замовчуванням.
    public BaseClass() {
    }

    // Користувацький конструктор.
    public BaseClass(int baseNumber) {
        this.baseNumber = baseNumber;
    }
}
