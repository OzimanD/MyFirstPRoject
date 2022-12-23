package StarterLevel.L6Methods.Chepter2;

public class test {
    static int plusMethod(int x, int y) {

        return x + y;

    }

    static int plusMethod(int x, double y) {

        return (int) (x + y);

    }

    public static void main(String[] args) {


        System.out.println("int: " +    plusMethod(4, 6.26));

        double r = plusMethod(4,7);
        System.out.println("double: " + r);

    }
}
