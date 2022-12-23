package OOP.L5nestedclasess.nested_classes.ex006_nestedclasses;

/**
 * Вкладені класи.
 * Класи можуть містити статичні Nested класи.
 */
class MyClass {
    public static class Nested {
        public static void staticMethodFromNested() {
            System.out.println("Статичний метод Nested класу.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();
    }
}
