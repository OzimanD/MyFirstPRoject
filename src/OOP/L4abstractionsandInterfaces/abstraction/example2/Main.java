package OOP.L4abstractionsandInterfaces.abstraction.example2;

public class Main {
    public static void main(String[] args) {
//        Bird bird = new Bird();
        Bird p = new Penguin();
        Bird s = new Straus();
        Bird sw = new Swallow();

        p.move();
        s.move();
        sw.move();
        sw.eat();

    }
}
