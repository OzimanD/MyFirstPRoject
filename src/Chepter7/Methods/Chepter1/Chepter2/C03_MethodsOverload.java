package Chepter7.Methods.Chepter1.Chepter2;

public class C03_MethodsOverload {
    // Перевантаження методів.

    static void operation() {                                           // 1-я перегрузка.
        operation("val", 10, 12.2);
    }

    static void operation(String value1) {                              // 2-я перегрузка.
        operation(value1, 20, 22.2);
    }

    static void operation(String value1, int value2) {                  // 3-я перегрузка.
        operation(value1, value2, 32.2);
    }

    static void operation(String value1, int value2, double value3) {   // 4-е перевантаження.
        System.out.println(value1 + ", " + value2 + ", " + value3);
    }

    public static void main(String[] args) {
        operation();                  // 1-е перевантаження.
        operation("val1");       // 2-е перевантаження.
        operation("val2", 30);         // 3-е перевантаження.
        operation("val3", 40, 42.2);   // 4-е перевантаження.
    }
}
