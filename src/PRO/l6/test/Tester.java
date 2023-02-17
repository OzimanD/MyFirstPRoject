package PRO.l6.test;

import java.lang.reflect.Method;

public class Tester {
    // Приймає масив класів (який описує свої класи)
    public static boolean test(Class... ls) {
        try {
            for (Class cl : ls) {
                // Отримуємо список методів
                Method[] methods = cl.getDeclaredMethods();
                for (Method method : methods) {
                    // Якщо якийсь метод анотований анотацією Test, ми викликаємо цей метод за допомогою рефлексії
                    if (method.isAnnotationPresent(Test.class)) {
                        // Щоб викликати статичний метод, то передаємо параметр null, замість об'єкту
                        Boolean b = (Boolean) method.invoke(null, new Object[]{});
                        if (!b)
                            return false;
                    }
                }
            }
            return true;
        } catch (Exception ex) {
            ex.printStackTrace();
            return false;
        }
    }
}
