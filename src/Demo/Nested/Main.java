package Demo.Nested;

/**
 * ¬кладен≥ класи.
 */
class MyClass {
    int b = 9;
    public class Nested extends Car {
        int a = 7;
        public void method() {
            System.out.println("method з Nested класу");
        }
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass.Nested instance = new MyClass().new Nested();
        MyClass myClass = new MyClass();

        instance.method();
        System.out.println(instance.a);
        System.out.println(myClass.b);
        int sum = instance.a + myClass.b;
        System.out.println(sum);
        instance.Wheels();

        System.out.println(instance.car);

    }
}
