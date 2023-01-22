package OOP.L8TryCach.ex003_exceptions;

/**
 * Обробка винятків.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw new Exception("Моє виключення");
        } catch (Exception e) {
            System.out.println("Обробка винятка.");
            System.out.println(e.getMessage());
        }
    }
}
