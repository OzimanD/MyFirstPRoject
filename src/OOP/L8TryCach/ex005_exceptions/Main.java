package OOP.L8TryCach.ex005_exceptions;

/**
 * Обробка виключень.
 * <p>
 * Для створення виключення користувача потрібно успадкування від Exception.
 */
class UserException extends Exception {
    public void method() {
        System.out.println("Мій Виняток!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException e) {
            System.out.println("Обробка виключення.");
            e.method();
        }
    }
}
