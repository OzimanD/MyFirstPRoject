package OOP.L5nestedclasess.nested_classes.ex005_nestedclasses;

/**
 * Вкладені класи.
 */
class MyClass extends BaseClass {
    public class Nested // Спадкування від BaseClass не поширюється.
    {
        public void methodFromNested() {
            System.out.println("Метод Nested класу.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass instance1 = new MyClass();
        instance1.methodFromBase();

        MyClass.Nested instance2 = new MyClass().new Nested();
        instance2.methodFromNested();
    }
}
