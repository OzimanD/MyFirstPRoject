package OOP.L8TryCach.ex007_exceptions;

/**
 * Обробка винятків.
 */
public class Main {
    public static void main(String[] args) {
        int a = 1, n = 2;

        try {
            System.out.println("Спроба поділу на нуль.");
            System.out.println("a / (2 - n) = " + (a / (2 - n)));
        } catch (Exception e) {
            System.out.println("Обробка виключення.");
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Блок finally.");
        }

        System.out.println("Кінець коду.");
    }
}
