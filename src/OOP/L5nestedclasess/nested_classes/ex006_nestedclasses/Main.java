package OOP.L5nestedclasess.nested_classes.ex006_nestedclasses;

/**
 * ������� �����.
 * ����� ������ ������ ������� Nested �����.
 */
class MyClass {
    public static class Nested {
        public static void staticMethodFromNested() {
            System.out.println("��������� ����� Nested �����.");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested.staticMethodFromNested();
    }
}
