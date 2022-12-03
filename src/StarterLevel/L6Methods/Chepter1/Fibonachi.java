package StarterLevel.L6Methods.Chepter1;

import java.util.Scanner;

public class Fibonachi {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Input number Fibonachi");
        int n = scanner.nextInt();
        int tmp = 0;
        int start = 1;
        for (int i = 2; i <= n; ++i) {
            int next = tmp + start;
            tmp = start;
            start = next;
        }
        System.out.println(start);
    }
}
