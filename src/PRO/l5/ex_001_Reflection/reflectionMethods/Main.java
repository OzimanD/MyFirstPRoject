package PRO.l5.ex_001_Reflection.reflectionMethods;

import java.lang.reflect.Constructor;
import java.lang.reflect.Method;

public class Main {
    static private final class CatMethods {
        public String name = "Marsel";
        private int age = 5;
        short ears = 5;
        protected long tail = 30;

        public CatMethods() {
        }

        public CatMethods(int age) {
            this.age = age;
        }

        public CatMethods(String name, int age, short ears, long tail) {
            this.name = name;
            this.age = age;
            this.ears = ears;
            this.tail = tail;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getAge() {
            return age;
        }

        public void setAge(int age) {
            this.age = age;
        }

        public short getEars() {
            return ears;
        }

        public void setEars(short ears) {
            this.ears = ears;
        }

        public long getTail() {
            return tail;
        }

        public void setTail(long tail) {
            this.tail = tail;
        }
    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        // Отримуємо клас, який описує клас CatMethods
        Class cl = CatMethods.class;

        System.out.println(s + "Constructors:" + s1);
        // Отримуємо масив конструкторів
        Constructor[] constructors = cl.getConstructors();
        for (Constructor ctr : constructors) {
            // Виводимо типи параметрів кожного конструктора (крім параметрів)
            Class[] paramTypes = ctr.getParameterTypes();
            for (Class paramType : paramTypes) {
                System.out.print(paramType.getName() + " ");
            }
            System.out.println();
        }
        try {
            // Створюємо масив та отримуємо посилання на клас з певним типом параметрів
            Class[] paramTypes = new Class[]{
                    int.class
            };
            // Отримуємо посилання на конструктор із певним параметром
            Constructor ctr = cl.getConstructor(paramTypes);
            // newInstance  = new, передаємо об'єкт
            CatMethods cm = (CatMethods) ctr.newInstance(Integer.valueOf(1));
            System.out.println(s + "Fields: " + s1 + cm.getAge() + ", Name - " + cm.getName() + ", Ears - " + cm.getEars() + ", Tail - " + cm.getTail());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        Method[] methods = cl.getMethods();
        for (Method method : methods) {
            System.out.println(s + "Name: " + s2 + method.getName());
            System.out.println(s + "\tReturn type: " + s1 + method.getReturnType().getName());
            Class[] paramTypes = method.getParameterTypes();
            System.out.print(s + "\tParam types:" + s1);
            for (Class<?> paramType : paramTypes) {
                System.out.print(" " + paramType.getName());
            }
            System.out.println();
        }

        try {
            CatMethods cm = new CatMethods();
            Class[] paramTypes = new Class[]{int.class};
            // Отримуємо посилання на метод з ім'ям setAge та параметром int
            Method method = cl.getMethod("setAge", paramTypes);
            Object[] objArguments = new Object[]{Integer.valueOf(8)};
            // Метод invoke приймає два параметри:
            // перший - це об'єкт, клас якого оголошує чи успадковує даний метод,
            // другий - масив значень параметрів, які передаються методу, що викликається
            method.invoke(cm, objArguments);
            System.out.println(s + "Age: " + s1 + cm.getAge());
        } catch (Exception ex) {
            ex.printStackTrace();
        }
        try {
            CatMethods obj = new CatMethods();
            Class[] paramTypes = new Class[]{String.class};
            // Намагаємось викликати не існуючий метод
            Method method = cl.getMethod("justMethod", paramTypes);
            Object[] arguments = new Object[]{Integer.valueOf("Hello")};
            method.invoke(obj, arguments);
        } catch (Exception ex) {
            System.out.println(ex.toString());
        }
    }
}


