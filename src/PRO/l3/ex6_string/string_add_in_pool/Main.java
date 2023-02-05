package PRO.l3.ex6_string.string_add_in_pool;

/**
 * Created by WinDRunneR on 05.08.2016.
 */
public class Main {
    public static void main(String[] args) {
        String s1 = "World";   // pool
        String s2 = "World";   // pool

        // Створюємо текст через конструктор
        String s3 = new String("World");
        String s4 = new String("World");
        System.out.println(s1 == s2);

        // Використовуючи метод intern - ми поміщаємо в пул значення
        System.out.println(s1 == s3.intern());
        System.out.println(s3.intern() == s4.intern());
        System.out.println();

        Integer a = 10;
        Integer b = 10;
        Integer c1 = 128;
        Integer c2 = 128;
        // Цілочисленні класи-обгортки свої значення поміщають у pool, в пулі можуть зберігатися числа від -128..127(1 byte)
        System.out.println(a == b);
        // Виходимо за діапазон 1 байту і отримуємо результат негативний
        System.out.println(c1 == c2);
    }
}
