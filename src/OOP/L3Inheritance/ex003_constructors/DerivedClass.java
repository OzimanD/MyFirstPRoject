package OOP.L3Inheritance.ex003_constructors;

/**
 * Успадкування.
 */
public class DerivedClass extends BaseClass {
    public int derivedField;

    // Конструктор за замовчуванням.
    //public DerivedClass()
    //{
    //}

    // Користувальницький конструктор.
    // При створенні об'єкта похідного класу конструктор похідного класу автоматично викликає конструктор
    // за замовчуванням з базового класу.
    // Конструктор базового класу, надасть всім даним якісь свої безпечні значення.
    // Після цього розпочне роботу конструктор похідного класу, який повторно
    // визначатиме значення для успадкованих членів. (ПОДВІЙНА РОБОТА)!
    public DerivedClass(int number1, int number2) {
        // Инициализируем поле базового класса.
        baseNumber = number1;

        // Инициализируем поле производного (данного) класса.
        derivedField = number2;
    }
}