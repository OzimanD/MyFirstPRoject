package Chepter6.Loops;

public class C03_WhileContinue {
    // Циклічна конструкція – while. (З пропуском ітерації - continue)

    public static void main(String[] args) {
        int counter = 0;

        while (counter < 5) {
            counter++;
            System.out.println("Counter " + counter);

            if (counter == 3) continue;

            System.out.println("Цей рядок не виконається.");
        }

        System.out.println("Вироблено " + counter + " ітерацій.");
    }
}
