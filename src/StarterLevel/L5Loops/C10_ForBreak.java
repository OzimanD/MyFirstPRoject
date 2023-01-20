package StarterLevel.L5Loops;

public class C10_ForBreak {
    // Циклічна конструкція (цикл із лічильником) - for (з достроковим виходом із циклу - break).

    public static void main(String[] args) {
        for (int i = 0; i < 5; i++) {
            System.out.println("Counter = " + i);

            if (false) break;

            System.out.println("Цей рядок не виконається.");
        }
    }
}
