package StarterLevel.L2Operathions;

import java.util.Scanner;

public class C14Input {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Введіть ціле число: ");
        int a = sc.nextInt();

        System.out.println("Введіть дрібне число: ");
        float b = sc.nextFloat();


        System.out.println("Введіть рядок із пробілами: ");
        String c = sc.next();

        sc = new Scanner(System.in);

        System.out.println("Введіть рядок: ");
        String d = sc.nextLine();

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
