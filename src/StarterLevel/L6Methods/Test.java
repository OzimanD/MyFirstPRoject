package StarterLevel.L6Methods;

public class Test {

    static int min(int a, int b){
        int min = 0;
        if(a<b){
           min = a;
        }else {
            min = b;
        }
        return min;
    }
    static int min(int a, int b, int c){
        int min = 0;
        if(a<b){
           min = a;
        }else {
            min = b;
        }
        return min;
    }
     static double min(double a, double b){
         double min = 0;
        if(a<b){
           min = a;
        }else {
            min = b;
        }
        return min;
    }


    public static void main(String[] args) {
        int i = min(7,8);
        double i1 = min(7.9,8.8);
    }
}
