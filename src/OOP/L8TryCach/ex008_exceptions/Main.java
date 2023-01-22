package OOP.L8TryCach.ex008_exceptions;

/**
 * Обробка винятків.
 * <p>
 * Для створення винятку користувача, потрібне успадкування від System.Exception.
 */
class UserException extends Exception {
    public void Method() {
        System.out.println("Мій Виняток!");
    }
}

public class Main {
    public static void main(String[] args) {
        try {
            throw new UserException();
        } catch (UserException userException) {
            System.out.println("Обробка виключення 1:");
            userException.Method();

            try {
                throw userException;
            } catch (UserException exception) {
                System.out.println("Обробка виключення 2:");
                exception.Method();
            }
        } finally {
            System.out.println("Блок finally.");
        }

        System.out.println("Кінець коду.");
    }
}
