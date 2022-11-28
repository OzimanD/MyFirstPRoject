package Chepter7.Methods.Chepter1.Chepter2;

public class test {
    static int met1(int a){
        int c = a*40;
        return c;
    }
    static void met2(int a){
        int c = a*26;
        System.out.println(c);
    }
    public static void main(String[] args) {
     int a = met1(7);
     met2(8);
     int c = a;
        System.out.println(c);
    }
}
