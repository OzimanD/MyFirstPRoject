package StarterLevel.L6Methods.Chepter2;

public class test {
    static int add(int a, int b){
        int c = a+b;
        return c;
    }
    static double add(double a, double b){
        double c = a+b;
        return c;
    }

    static void add(){
        int c = add(7,5);
        double c1 = add(7.7,5.5);
        double result = c+c1;
        System.out.println(result);
    }

    public static void main(String[] args) {
        System.out.println(add(7,7));
        System.out.println(add(8.8,8.8));
        add();
    }
}
