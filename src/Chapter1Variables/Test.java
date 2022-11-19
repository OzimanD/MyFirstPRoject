package Chapter1Variables;


public class Test {
    public static void main(String[] args) {

        int a = -7;
        int b = 7;
        int c = 8;
        int e = 5;
        int tmp=0;
        if((a>b&&a>c)&&a>e){
            a++;
            tmp = a;
        }else if(a==0) {
            tmp = 10;
        }else {
            tmp = a-2;
        }
        System.out.println(tmp);
//        boolean b1 = (a&b);
        System.out.println((a&b));
    }
}
