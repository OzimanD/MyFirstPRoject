package Chapter2;

public class C11_StringFormat {
    public static void main(String[] args) {
        int a = 1, b = 2, c = 3;

        System.out.println("Це число " + a);

        System.out.println(String.format("Це число %1$s", a));

        System.out.printf("Це число %1$s \n", a);
        System.out.printf("Це числа %1$s та %2$s \n", b, c);
        System.out.printf("Це числа навпаки %2$s та %1$s", b, c);

        System.out.printf("\n%1$+022.10f", Math.PI);
        System.out.println();
        System.out.println("Це числа"+" "+b+"та"+c);
    }
}
