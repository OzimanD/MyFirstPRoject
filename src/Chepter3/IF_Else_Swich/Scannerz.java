package Chepter3.IF_Else_Swich;

import java.util.Scanner;

public class Scannerz {
    public static void main(String[] args) {
        System.out.println("Just input smth:");

        
        Scanner input = new Scanner(System.in);
//        String buffer = input.next();
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

//        System.out.println(buffer);
        System.out.println(a + " " +b+ " "+ c);
    }
}
