package StarterLevel.L1Variables;

public class C4Char {
    public static void main(String[] args) {
        char a = 'A';
        char b = 0x0041;    // 16-річному форматі
        char c = '\u265E';  // формат unicode

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        double q = 48;
        double r = Math.sqrt(q);

        System.out.println(r);
    }
}
