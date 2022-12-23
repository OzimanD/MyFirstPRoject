package OOP.L1Previev.ex5_what_is_null;

import OOP.L1Previev.ex1_class_declaration.Car;

public class MyClass {
    public static void main(String[] args) {

        String st1 = null;    // можна стрінгу присвоїти null
        Car car1 = null;      // можна примірнику класу присвоїти null
        // int i = null;      // не можна в примітивний тип впхнути null

        String str2 = (String) null; // null піддається кастуванню в інші типи
        Car car2 = (Car) null;

        System.out.println(null == null);      // true
        System.out.println(car1 == null);      // true
        System.out.println(str2.equals(null));

        car1.getMaxSpeed(); // NullPointerException (RuntimeException)
    }
}
