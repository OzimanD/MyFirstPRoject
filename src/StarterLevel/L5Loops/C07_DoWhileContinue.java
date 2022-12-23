package StarterLevel.L5Loops;

public class C07_DoWhileContinue {
    // Циклічна конструкція – do-while. (З пропуском ітерації - continue)

    public static void main(String[] args) {
        int counter = 0;

        do {
            counter++;
            System.out.println("Counter " + counter);

            if (counter==3) continue;

            System.out.println("Цей рядок не виконається.");
        } while (counter < 5);

        System.out.println("Вироблено " + counter + " ітерацій.");
    }
}
