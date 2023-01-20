package OOP.L5nestedclasess.nested_classes.ex004_nestedclasses;

/**
 * Вкладені класи.
 */
class MyClass { // Спадкування від BaseClass не поширюється.
    public class Nested extends BaseClass {
        public void methodFromNested() {
            System.out.println("Метод Nested класу.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();

        instance.methodFromBase();
        instance.methodFromNested();
    }
}
