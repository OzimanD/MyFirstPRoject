package OOP.L3Inheritance.Test;

public class ClassB extends ClassA {
    static int w = 9;
    static int age;

//    public ClassB(int a, int b, String name, String surname) {
//        super(a, b, name, surname);
//    }
//
//    public ClassB(int a, int b, String name, String surname, int w, int age) {
//        super(a, b, name, surname);
//        this.w = w;
//        this.age = age;
//    }

    public static void MSG(){
        System.out.println("Class b");
    }

    public static void main(String[] args) {
        show();
        a = 9;
        b = 8;
        name = "Dima";
        age = 18;

    }
}
