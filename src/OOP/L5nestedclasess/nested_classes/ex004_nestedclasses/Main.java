package OOP.L5nestedclasess.nested_classes.ex004_nestedclasses;

/**
 * ������� �����.
 */
class MyClass { // ����������� �� BaseClass �� �����������.
    public class Nested extends BaseClass {
        public void methodFromNested() {
            System.out.println("����� Nested �����.");
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
