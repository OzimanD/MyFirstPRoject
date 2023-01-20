package StarterLevel.L6Methods.Chepter1;

public class Test {
    static int add(int a, int b){
        int c = a+b;
        return c;
    }

    static double mines(int a, int b){
        double c = a-b;
        return c;
    }

    static String show(){
        return "result = ";
    }
    public static void main(String[] args) {
        int result = add(7,8);
        System.out.println(result);
        double result1 = mines(7,8);
        System.out.println(result1);

        double res = result1 + result;
        System.out.println(show()+res);

    }
}
