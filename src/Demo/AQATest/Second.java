package Demo.AQATest;


import static Demo.AQATest.Third.meth2;

public class Second {
    public static void main(String[] args) {
        Firs firs = new Firs("Dima","Red",31);
        System.out.println(firs.name);
        System.out.println(firs.surname);
        System.out.println(firs.age);
        Firs firs1 = new Firs("Red1", "Yellow3");
        System.out.println(firs1.name);
        System.out.println(firs1.surname);
        System.out.println(firs1.age);
        Firs rt = new Firs();
//        rt.name = "Name";
//        rt.surname = "Surname";
//        rt.age = 18;
        System.out.println(rt.name);
        System.out.println(rt.surname);
        System.out.println(rt.age);
        firs.name = "2";

    }
}
