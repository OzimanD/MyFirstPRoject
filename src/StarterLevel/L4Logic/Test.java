package StarterLevel.L4Logic;

public class Test {
    public static void main(String[] args) {
        int numb1 = 11;
        int numb2 = 11;
        int max = 0;
        if(numb1>numb2){
            max = numb1;
            System.out.println(max);
        } else if(numb1==numb2){
            System.out.println("equals");
        }else {
            max = numb2;
            System.out.println(max);

        }
    }
}
