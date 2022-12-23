package StarterLevel.L5Loops;

public class C05_DoWhile {
    // Циклічна конструкція - do-while.

    public static void main(String[] args) {
        int i = 0;

        do {
            i++;
            System.out.println("Counter " + i);
        } while (i > 3);

        System.out.println("Вироблено " + i + " ітерацій.");
    }
}
