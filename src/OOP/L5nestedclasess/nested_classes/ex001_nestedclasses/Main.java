package OOP.L5nestedclasess.nested_classes.ex001_nestedclasses;

/**
 * Вкладені класи.
 */
class MyClass {
    public class Nested {
        public void method() {
            System.out.println("Метод з Nested класу");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.method();
    }
}
