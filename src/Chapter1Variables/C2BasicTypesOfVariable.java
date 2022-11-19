package Chapter1Variables;

public class C2BasicTypesOfVariable {
    public static void main(String[] args) {
        // ЦІЛІ ТИПИ
        // 8-bits == 1 byte. ----------------------------------------------------------------------------

        // Ціле зі знаком. Діапазон - від -128 до +127.
        byte a = -128;
        byte b = +127;

        // 16-bits == 2 bytes. -------------------------------------------------------------------------

        // Ціле зі знаком. Діапазон - від -32768 до +32767.
        short c = -32768;
        short d = +32767;


        // 32-bits = 4 bytes. ---------------------------------------------------------------------------

        // Ціле зі знаком. Діапазон - від -2147483648 до +2147483647.
        int e = -2147483648;
        int f = +2147483647;


        // 64-bits = 8 bytes. ---------------------------------------------------------------------------

        // Ціле зі знаком. Діапазон - від -9223372036854775808 до +9223372036854775807.
        long g = -922337203;
        long h = +922_337_203_685_477_580_7L;


        // РЕЧОВИННІ ТИПИ

        // Речовинні типи призначені для представлення дрібних чисел.

        // 32-bits = 4 bytes. ---------------------------------------------------------------------------

        // Речовинне зі знаком. Діапазон – від +/-1.5 x 10^-45 до +/-3.4 x 10^38.
        float i = -0.123456789f;  // Вказівка суфікса f є обов'язковим,
        float j = +1.123456789111649449494F; // т.як, компілятор інтерпретує це число як double.
//        System.out.println(j);

        // 64-bits = 8 bytes. ---------------------------------------------------------------------------

        // Речовинне зі знаком. Діапазон - від +/-5.0 x 10^-324 до +/-1.7 x 10^308.
        double k = -0.123456789D;
        double l = +1.123456789111649449494D;
//        System.out.println(l);

        // ЛОГІЧНИЙ ТИП

        // 8-bits == 1 byte. ----------------------------------------------------------------------------

        // Логічна величина Істина/Брехня.
        boolean m = true;
        boolean n = false;

        // СИМВОЛЬНИЙ ТИП

        // 16-bits == 2 bytes. -------------------------------------------------------------------------
        // Символ у форматі UNICODE.
        char o = 'a';
        char p = 'A';

        // РЯДКОВИЙ ТИП

        // Рядок у форматі UNICODE.
        String firstString = "hello";
        String secondString = "HELLO";
        System.out.println(firstString);


        System.out.println(a);
        System.out.println(b);
        System.out.println(c);
        System.out.println(e);
        System.out.println(f);
        System.out.println(g);
        System.out.println(h);
        System.out.println(i);
        System.out.println(j);
        System.out.println(k);
        System.out.println(l);
        System.out.println(m);
        System.out.println(n);
        System.out.println(o);
        System.out.println(p);
        System.out.println(firstString);
        System.out.println(secondString);

        System.out.println(Integer.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE);
    }
}
