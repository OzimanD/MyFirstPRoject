package OOP.L8TryCach.ex012_exceptions;

/**
 * Обробка винятків.
 */
public class Main {
    public static void main(String[] args) {
        try {
            throw null;
        } catch (NullPointerException ex) {
            System.out.println(ex.getMessage());
        }
    }
}
