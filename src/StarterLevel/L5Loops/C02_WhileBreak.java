package StarterLevel.L5Loops;

public class C02_WhileBreak {
    // Циклічна конструкція – while. (з достроковим виходом із циклу - break)

    public static void main(String[] args) {
        int i = 0;

        while (i < 5) {
            i++;
            System.out.println("Counter " + i);

            if (i==3) break;

            System.out.println("Цей рядок не виконається.");
        }

    }
}
