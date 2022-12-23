package OOP.L5nestedclasess.static_members.ex003_static_blocks;

/**
 * Статичні блоки.
 * Статичний блок викликається, коли клас підвантажується на згадку.
 */
public class NotStaticClass {
    public static final int X;

    // Статический блок.
    static {
        X = 10;
        System.out.println("Static block  X = " + X);
    }

    public NotStaticClass() {
        // X = 4; // Помилка, оскільки статичний блок викликається раніше, ніж конструктор.
        System.out.println("Constructor  X = " + X);
    }
}
