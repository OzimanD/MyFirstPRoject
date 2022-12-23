package StarterLevel.L5Loops;

public class C03_WhileContinue {
    // Циклічна конструкція – while. (З пропуском ітерації - continue)

    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            i++;
            System.out.println("Counter " + i);

            if (i == 3) continue;

            System.out.println("Цей рядок не виконається.");
        }

        System.out.println("Вироблено " + i + " ітерацій.");
    }
}
