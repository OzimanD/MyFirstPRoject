package PRO.l5.ex_003featuresOfClass;

import java.lang.reflect.Member;

// У параметрах додати шлях до класу(java.lang.String)
public class Main {
    public static void main(String[] args) {
        try {
            // Отримуємо об'єкт типу клас
            Class c = Class.forName(args[0]);
            System.out.println(c);
            // Викликаємо всі поля класу
            printMembers(c.getFields());
            // Викликаємо всі конструктори класу
            printMembers(c.getConstructors());
            // Викликаємо всі методи класу
            printMembers(c.getMethods());
        } catch (ClassNotFoundException e) {
            System.out.println("Невідомий клас:" + args[0]);
        }
    }

    private static void printMembers(Member[] mems) {
        // Пробігаємось по всій довжині інтерфейсу Member
        for (int i = 0; i < mems.length; i++) {
            if (mems[i].getDeclaringClass() == Object.class)
                continue;
            String decl = mems[i].toString();
            System.out.print("   ");
            System.out.println(decl);
        }
    }
}

