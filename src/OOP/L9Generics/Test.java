package OOP.L9Generics;

import java.util.ArrayList;

public class Test {
    public int a;
    public String b;

    public Test(int a, String b) {
        this.a = a;
        this.b = b;
    }
}
class Main{
    public static void main(String[] args) {
        Test test = new Test(8, "ter");
        ArrayList<Integer> ar = new ArrayList();
        ar.add(7);

    }
}