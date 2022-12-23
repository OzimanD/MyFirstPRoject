package OOP.L3Inheritance.ex004_constructors;

/**
 * Успадкування
 */
public class DerivedClass extends BaseClass {
    public int derivedField;

    // Конструктор за замовчуванням.
    public DerivedClass() {
    }

    // користувацький конструктор.
    // викликається користувацький конструктор базового класу, при цьому не потрібно,
    // надавати значення, успадкованим членам у конструкторі похідного класу.
    public DerivedClass(int number1, int number2) {
        super(number1);
        derivedField = number2;
    }
}
