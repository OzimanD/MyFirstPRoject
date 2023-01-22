package OOP.L9Generics.ex007_generics_bounded_type;

/**
 * Обмеження параметрів типу
 */
class Base {
}

class Derived extends Base {
}

/**
 * T extends Base - аргумент типу повинен бути або похідним від зазначеного базового класу.
 */
class MyClass<T extends Base> {
}

public class Main {
    public static void main(String[] args) {
        MyClass<Base> mc1 = new MyClass<>();

        MyClass<Derived> mc2 = new MyClass<>();

        //MyClass<String> mc3 = new MyClass<>(); // Помилка.
    }
}
