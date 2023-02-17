package PRO.l6.ex_001_Annotations.methods;

import java.lang.annotation.Annotation;
import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        try {
            AnotherDog dog = new AnotherDog();
            Annotation[] classAnnotations = dog.getClass().getAnnotations();

            System.out.println(dog.getClass().getName() + "\nAnnotations:");
            for (Annotation annotation : classAnnotations)
                System.out.println("\t" + annotation);

            Method[] classMethods = dog.getClass().getMethods();
            System.out.println("Method annotations:");
            for (Method method : classMethods) {
                Annotation[] methodAnnotations = method.getAnnotations();
                if (methodAnnotations.length > 0) {
                    System.out.println("\t" + method.getName() + "():");
                }
                for (Annotation annotation : methodAnnotations) {
                    System.out.println("\t" + annotation);
                }
            }
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}