package OOP.L8TryCach.ex004_exceptions;

import java.lang.Exception;

/**
 * ������� �������.
 */
class MyClass {
    public void myMethod() throws Exception {
        Exception exception = new Exception("̳� �������");
        throw exception;
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            MyClass instance = new MyClass();
            instance.myMethod();
        } catch (Exception e) {
            System.out.println("Message: " + e.getMessage());
            System.out.println("Stack trace:");
            e.printStackTrace();
        }
    }
}
