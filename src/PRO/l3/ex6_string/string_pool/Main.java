package PRO.l3.ex6_string.string_pool;

public class Main {
    public static void main(String[] args) {
        // Значення заносимо в пул
        String s1 = "World";   // pool
        String s2 = "World";   // pool

        // Створюємо рядкове значення через конструктор, в пул не поміщаємо
        String s3 = new String("World");
        String s4 = new String("World");
        System.out.println(s1 == s2);
        System.out.println(s1 == s3);
        System.out.println(s3 == s4);
        System.out.println();
        Integer a = 10;
        Integer b = 10;
        Integer c1 = 128;
        Integer c2 = 128;
        Integer aNew = new Integer(10);
        Integer bNew = new Integer(10);
        System.out.println(aNew == bNew);
        // Цілочисленні класи-обгортки свої значення поміщають в pool, в пулі можуть зберігатися числа від -128..127(1 byte)
        System.out.println(a == b);
        // Виходимо за діапазон 1 байту і отримуємо результат негативний
        System.out.println(c1 == c2);
    }
}
