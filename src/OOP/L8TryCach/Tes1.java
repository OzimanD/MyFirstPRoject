package OOP.L8TryCach;

public class Tes1 {
    public static void main(String[] args) {
        try {
            int a = 0;
            System.out.println("world");
            System.out.println(8/a);
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
        }catch (Exception e){
            System.out.println("/ by zero it's an Error");
        }finally {
            System.out.println("hello");
            System.out.println("hello");
            System.out.println("hello");
        }
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }

    }
}
