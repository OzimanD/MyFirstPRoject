package StarterLevel.L3IF_Else_Swich;

public class Test {
    public static void main(String[] args) {
        int a = -8, b = 10, c = 0;
        int sumPlus=0;
        int sumMinus = 0;
        int sumNull = 0;
        if(a>0){
            sumPlus++;
        }else if(a==0) {
            sumNull++;
        }else {
            sumMinus++;
        }
        if(b>0){
            sumPlus++;
        }else if(b==0) {
            sumNull++;
        }else {
            sumMinus++;
        }
        if (c>0){
            sumPlus++;
        }else if(c==0) {
            sumNull++;
        }else {
            sumMinus++;
        }


        System.out.println(sumPlus);
        System.out.println(sumNull);
        System.out.println(sumMinus);
    }
}