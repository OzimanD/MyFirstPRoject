package OOP.L7AnonimusClassesEnums.anonymous.ex003_anonymous_classes;

/**
 * Анонімні класи.
 */
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Оголошення анонімного (внутрішнього) класу
        Interface instance = new Interface() {
            public int publicField = 3;

            @Override
            public void method() {
                publicField = 1234;
                System.out.println("instance1: publicField = " + getPublicField());
            }

            public int getPublicField() {
                return publicField;
            }
        };

        instance.method();

        // Метод недоступний
        // System.out.println(instance.getPublicField());
    }
}
