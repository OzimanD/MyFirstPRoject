package OOP.L8TryCach.ex002_exceptions;

/**
 * Обробка винятків.
 */
public class Main {
    public static void main(String[] args) {
        Exception ex = new Exception("Мій Виняток");

        try {
            throw ex;
        } catch (Exception e) {
            System.out.println("Обробка виключення.");
            System.out.println(e.getMessage());
        }
    }
}
