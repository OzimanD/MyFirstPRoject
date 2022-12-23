package OOP.L1Previev;

import OOP.L1Previev.ex1_class_declaration.Main;

final class Main1 {
    int qw = 5;
    public static void Met(){
        System.out.println("hello");
    }

    public static void main(String[] args) {
        Main1 main1 = new Main1();
        Main1 main11 =new Main1();
        Main2 main2 = new Main2();
        main1.qw = 7;
        System.out.println(main1.qw);
        System.out.println(main11.qw);
        Met();
    }
}

