package PRO.l5.ex_002access;

import java.lang.reflect.Field;

public class Main {
    static private final class Dog {
        private int age = 3;
    }

    public static void main(String[] args) {
        try {
            Class cl = Dog.class;
            Dog dog = new Dog();
            // На ім'я name отримуємо клас Field
            Field field = cl.getDeclaredField("age");
            // true - знімаємо модифікатор до public, false - забороняємо
            field.setAccessible(true);
            // У класу Field є різні методи get
            System.out.println("Private field value: " + field.getInt(dog));
            field.setInt(dog, 10);
            System.out.println("New private field value: " + field.getInt(dog));
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
