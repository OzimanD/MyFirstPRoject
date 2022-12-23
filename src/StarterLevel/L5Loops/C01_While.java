package StarterLevel.L5Loops;

public class C01_While {
    // Циклічна конструкція - while.

    public static void main(String[] args) {
        int i = 0;
        int iteration = 0;

        while (i > 5) {
            i--;
            System.out.println("Counter " + i);
            iteration++;
        }
        System.out.println("iteration = "+ iteration);
    }
}
