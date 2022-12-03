package StarterLevel.L4Logic;

public class Test {
    public static void main(String[] args) {
        int a = 27;
        int b = 18;
        int c = 9;
        int max = 0;
        int min = 0;
        int average = 0;

        if((a>b) && (a>c)){
            max = a;
        }else if((b>a) && (b>c)){
            max = b;
        }else {
            max = c;
        }
        if((a<b) && (a<c)){
            min = a;
        }else if((b<a) && (b<c)){
            min = b;
        }else {
            min = c;
        }
        System.out.println(max);
        System.out.println(min);
    }
}
