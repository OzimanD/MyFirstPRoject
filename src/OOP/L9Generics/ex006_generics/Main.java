package OOP.L9Generics.ex006_generics;

import test.Mers;

/**
 * Поганий приклад. Так не рекомендується.
 */
class MyClass<T> {
    public T add(T a, T b) {
        if (a.getClass().equals(Integer.class)) {
            return (T) (Object) ((Integer) a + (Integer) b);
        }

        if (a.getClass().equals(Double.class)) {
            return (T) (Object) ((Double) a + (Double) b);
        }

        return (T) (Object) 0;
    }
}

public class Main {
    public static void main(String[] args) {
        MyClass<Integer> my = new MyClass<>();
        int sum = my.add(2, 3);

        MyClass<Double> db = new MyClass<>();
        double sum1 = db.add(8.8,9.9);

        System.out.println(sum);
        System.out.println(sum1);

    }
}
