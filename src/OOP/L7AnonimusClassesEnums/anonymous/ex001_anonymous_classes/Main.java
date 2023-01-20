package OOP.L7AnonimusClassesEnums.anonymous.ex001_anonymous_classes;

/**
 * Анонімні класи.
 */
interface Interface1 {
    void method();
}

public class Main {
    public static void main(String[] args) {
        // Оголошення анонімного (внутрішнього) класу
        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Call method() from anonymous class");
            }
        };

        // Виклик методу об'єкта анонімного класу
        instance.method();
    }
}
