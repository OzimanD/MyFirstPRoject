package OOP.L7AnonimusClassesEnums.anonymous.ex004_anonymous_classes;

/**
 * Анонімні класи
 * Локальні змінні доступні у блоці оголошення анонімного класу.
 */
interface Interface {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Локальні змінні доступні у блоці оголошення анонімного класу
        int N = 100;

        // Оголошення анонімного (внутрішнього) класу
        Interface instance = new Interface() {
            public int publicField = 11;

            @Override
            public void method() {
                publicField = N;
                System.out.println("instance: n = " + publicField);
            }
        };

        instance.method();
    }
}
