package PRO.l5.ex_001_Reflection.reflectionModifier;

import java.lang.reflect.Modifier;

public class Main {
    static private final class CatModifier {
    }

    public static void main(String[] args) {
        String s = (char) 27 + "[31m";
        String s1 = (char) 27 + "[39m";
        String s2 = (char) 27 + "[34m";
        // Отримуємо клас, який описує клас CatModifier
        Class cl = CatModifier.class;
        // Дізнаємось ім'я класу
        System.out.println(s + "Class name: " + s1 + cl.getName());
        System.out.print(s + "Modifiers of class: " + s1);
        // getModifiers(), повертає ціле значення
        int mods = cl.getModifiers();
        if (Modifier.isPrivate(mods))
            System.out.print("private ");
        if (Modifier.isAbstract(mods))
            System.out.print("abstract ");
        if (Modifier.isFinal(mods))
            System.out.print("final ");
    }
}
