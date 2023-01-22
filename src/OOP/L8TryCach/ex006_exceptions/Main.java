package OOP.L8TryCach.ex006_exceptions;

import java.io.FileInputStream;

/**
 * Обробка винятків.
 * <p>
 * Для створення винятку користувача, потрібне успадкування від System.Exception.
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
        } catch (UserException userException) {
            System.out.println("Обробка виключення.");
            userException.method();

            try {
                FileInputStream fs = new FileInputStream("C:\\NonExistentFile.log");
            } catch (Exception exception) {
                System.out.println(exception.getMessage());
            }
        }
    }
}
