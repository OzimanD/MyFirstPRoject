package Chapter2;

public class C2_Casting {
    public static void main(String[] args) {

        byte a = 10;    //                                      0000 1010  -  1 байт
        int b = 0;      //  0000 0000   0000 0000   0000 0000   0000 0000  -  4 байта
        b = a;          //  0000 0000   0000 0000   0000 0000   0000 1010  -  4 байта

        System.out.println("int b = " + b);

        int c = 255;
        float d = 0f;
        d = c;

        System.out.println("float d = " + d);


        int e = 128;    //  0000 0000   0000 0000   0000 0000   1000 0000  -  4 байта
        byte f = 0;     //                                      0000 0000  -  1 байт
        f = (byte)e;    //                                      0000 0001  -  1 байт
        // f = e;       //  ПОМИЛКА.
        System.out.println("byte f = " + f);


        float g = 10.5f;
        int h = 0;
        h = (int)g;
        // h = g;       // ПОМИЛКА.

        System.out.println("int h = " + h);


        final int i = 127;
        byte j = 0;
        j = i;

        System.out.println("byte j = " + j);

        final float k = 255;
        byte l = 0;
        l = (byte)k;

        System.out.println("byte l = " + l);


        final int m = 254;  //  0000 0000   0000 0000   0000 0000   1111 1110  -  4 байта
        byte n = 0;         //                                      0000 0000  -  1 байт
        n = (byte)m;        //                                      0000 0001  -  1 байт
        // n = m;           //  ПОМИЛКА.

        System.out.println("byte n = " + n);


        final float o = 128.5f;
        byte p = 0;
        p = (byte)o;
        // p = o;           //  ПОМИЛКА.

        System.out.println("byte p = " + p);
    }
}
