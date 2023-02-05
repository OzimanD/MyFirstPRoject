package OOP.L9Generics.ex003_generics;

/**
 * Універсальні візерунки. (Універсальний метод)
 */
class MyClass {
    public <T> void method(T argument) {
        T variable = argument;

        System.out.println(variable);
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance = new MyClass();

        instance.method("Hello world!"  );
    }
}
