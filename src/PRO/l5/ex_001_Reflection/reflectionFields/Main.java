package PRO.l5.ex_001_Reflection.reflectionFields;

import java.lang.reflect.Field;

public class Main {
    static private final class CatFields {
        public String name = "Marsel";
        private int age = 5;
        short ears = 5;
        protected long tail = 30;
    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        // Отримуємо клас, який описує клас CatFields
        Class cl = CatFields.class;
        System.out.println(s + "Public Reflection fields:" + s1);
        // Метод getFields(), повертає лише поля з модифікатором public
        Field[] fields = cl.getFields();
        // Пробігаємося класом Field і виводимо всі public поля
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }

        System.out.println(s + "All Modifiers Reflection fields:");
        fields = cl.getDeclaredFields();
        for (Field field : fields) {
            Class fieldType = field.getType();
            System.out.println(s2 + "\tName: " + s1 + field.getName());
            System.out.println(s2 + "\tType: " + s1 + fieldType.getName());
        }
    }
}

