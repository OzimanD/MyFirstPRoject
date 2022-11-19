import java.util.Scanner;

public class SwichPractice {
    public static void main(String[] args) {
        Scanner ZSU = new Scanner(System.in);
        System.out.println("Input result = ");
        int num = ZSU.nextInt();

        switch (num){
            case 1:
                System.out.println("Bed");
                break;
            case 2:
                System.out.println("Not very bed");
                break;
            case 3:
                System.out.println("Not Bad");
                break;
            case 4:
                System.out.println("Good");
                break;
            case 5:
                System.out.println("Very Good");
                break;
            default:
                System.out.println("Eror");
        }
    }
}
