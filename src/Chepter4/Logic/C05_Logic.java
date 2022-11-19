package Chepter4.Logic;

public class C05_Logic {
    // Логічні операції.

    // Наприклад:
    // Щоб перевірити умову A < x < B, не можна записати її в умовному операторі безпосередньо,
    // оскільки кожна операція відносин повинна мати два операнди.
    // Правильний спосіб запису: if (A < x & & x < B).

    public static void main(String[] args) {
        int a = 0, b = 5, x = 3;

        if (a < x && x < b) {   // a < x < b
            System.out.println("Число " + x + " знаходиться у диапазоні чисел від " + a + "  до " + b + ".");
        } else {
            System.out.println("Число " + x + " не потрапляє у диапазон чисел від " + a + "  до " + b + ".");
        }
    }
}
