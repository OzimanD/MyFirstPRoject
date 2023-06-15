package test.methods;

public class Methods {
//    public static void perimetr(int a){
//        int p = 4 * a;
//        System.out.println(p);
//    }

//    public static double perimetr(int a){
//        double p = 4 * a;
//        return p;
//    }
//    public static double plosha(int a){
////        double s = Math.pow(a,2);
////        return s;
////    }
    public static String plper(double a, double b){
        double s = a*b;
        double p = 2*(a+b);
        return "s = " + s + "; p = "+ p;
    }
    public static void main(String[] args) {
        String result = plper(7,9);
        System.out.println(result);
    }
}
