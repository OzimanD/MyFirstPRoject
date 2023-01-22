package OOP.L9Generics.ex001_generics;

/**
 * Універсальні візерунки.
 * На 8-му рядку створюємо клас з ім'ям MyClass, параметризований вказівником місця заповнення типом - T
 */
class MyClass<T> {
    public T field;

    public void method() {
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        // Створюємо екземпляр класу MyClass і як параметр типу (тип MyClass) передаємо тип String.
        MyClass<String> instance1 = new MyClass<String>();
        instance1.field = "ABC";
        instance1.method();

        //// Як параметр типу передавати примітивні типи (int, long, float, double, тощо) не можна.
        // MyClass<int> instance2 = new MyClass<int>();
        // instance2.method();

        // Створюємо екземпляр класу MyClass і як параметр типу (тип MyClass) передаємо тип Integer.
        MyClass<Integer> instance2 = new MyClass<Integer>();
        instance2.field = 1234;
        instance2.method();
    }
}
