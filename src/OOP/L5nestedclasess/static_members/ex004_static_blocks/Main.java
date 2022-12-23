package OOP.L5nestedclasess.static_members.ex004_static_blocks;

/**
 * Статичні блоки.
 * В основному, статичні блоки використовують, щоб встановити значення за замовчуванням для членів класу.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println(NotStaticClass.X);

        NotStaticClass instance = new NotStaticClass(1111);
        System.out.println(instance.X);

        System.out.println(NotStaticClass.X);
    }
}
