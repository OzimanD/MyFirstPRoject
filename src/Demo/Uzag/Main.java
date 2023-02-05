package Demo.Uzag;


class MyClass<TYPE> {
    public TYPE field;

    public void method() {
        System.out.println(field.getClass());
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<String> instance1 = new MyClass<String>();
        instance1.field = "ABC";
        instance1.method();
        System.out.println(instance1.field);

        MyClass<Integer> instance2 = new MyClass<Integer>();
        instance2.field = 1234;
        instance2.method();
        System.out.println(instance2.field);

        MyClass<Double> instance3 = new MyClass<>();
        instance3.field = 3.14;
        instance3.method();
        System.out.println(instance3.field);
    }
}
