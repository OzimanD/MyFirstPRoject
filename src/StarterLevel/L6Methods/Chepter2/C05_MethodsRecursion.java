package StarterLevel.L6Methods.Chepter2;

public class C05_MethodsRecursion {
    // Рекурсія (проста рекурсія).

    // У тілі методу recursion на 15-му рядку рекурсивно викликається метод recursion.
    // Проста рекурсія – виклик методом самого себе (самовиклик). Під час кожного виклику будується нова копія методу.

    static void recursion(int counter) {
        int i = 0;
        counter--;

        System.out.println("Перша половина методу: " + counter);

        if (counter != 0)
            recursion(counter);

        System.out.println("Друга половина методу: " + counter);
    }

    public static void main(String[] args) {
        recursion(3);
    }
}
