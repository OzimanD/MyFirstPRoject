package OOP.L3Inheritance.ex004_constructors;

/**
 * Успадкування.
 */
public class BaseClass {
    public int baseNumber;

    // Конструктор за замовчуванням.
    public BaseClass() {
    }

    // Користувацький конструктор.
    public BaseClass(int number) {
        this.baseNumber = number;
    }
}
