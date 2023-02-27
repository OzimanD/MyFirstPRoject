package PRO.l6.test;

public class SomeClass {
    // Метод приймає масив(varArgs) long
    public static long job(long... ls) {
        long res = 0;
        for (long l : ls)
            res += l;
        return res;
    }

    // Тестовий метод
    @Test
    public static boolean selfTest() {
        // Тестуємо нашу програму, 1 + 2 + 3 + 4 == 10
        boolean res = job(1, 2, 3, 4,7) == 10;
        System.out.println("SomeClass: " + res);
        return res;
    }
}
