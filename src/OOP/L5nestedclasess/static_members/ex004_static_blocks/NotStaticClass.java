package OOP.L5nestedclasess.static_members.ex004_static_blocks;

/**
 * Статичні блоки.
 * Статичних блоків може бути скільки завгодно і викликатися вони будуть у тому порядку, в якому написані.
 */
public class NotStaticClass {
    static int X;

    static {
        X = 1;
        System.out.println("Static block  X = " + X);
    }

    static {
        X = 23;
        System.out.println("Static block  X = " + X);
    }

    static {
        X = -99;
        System.out.println("Static block  X = " + X);
    }

    public NotStaticClass(int x) {
        X = x;
        System.out.println("Constructor  X = " + X);
    }
}
