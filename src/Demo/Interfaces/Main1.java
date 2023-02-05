package Demo.Interfaces;

public class Main1 implements Add, Minus, Mult{
    @Override
    public int add(int a, int b) {
        return a+b;
    }

    @Override
    public int mines() {
        return 7-3;
    }

    @Override
    public double mult() {

        return 2*9;
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        System.out.println(main1.add(7,9));
        System.out.println(main1.mines());
        System.out.println(main1.mult());
    }
}
