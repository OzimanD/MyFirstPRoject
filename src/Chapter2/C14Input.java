package Chapter2;

import java.util.Scanner;

public class C14Input {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Введіть ціле число: ");
        int a = input.nextInt();

        System.out.println("Введіть дрібне число: ");
        float b = input.nextFloat();


        System.out.println("Введіть рядок із пробілами: ");
        String c = input.next();

        input = new Scanner(System.in);

        System.out.println("Введіть рядок: ");
        String d = input.nextLine();

        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
    }
}
