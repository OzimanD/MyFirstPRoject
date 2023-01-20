package Demo;

import Demo.AQATest.Firs;

public class Main {
     public int msg(int a){
        a +=a;
        return a;
    }

    public void Message(){
        System.out.println("world");
    }

    public static void main(String[] args) {
        Main main = new Main();
        main.Message();
        int c = main.msg(7);
        System.out.println(c);
        Firs firs = new Firs();
//        firs.name = "9";
        firs.Meth();
    }
}
