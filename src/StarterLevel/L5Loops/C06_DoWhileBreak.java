package StarterLevel.L5Loops;

public class C06_DoWhileBreak {
    // Циклічна конструкція – do-while. (з достроковим виходом із циклу - break)

    public static void main(String[] args) {
        int i = 0;

        do {
            i++;
            System.out.println("Counter " + i);

            if (i==2) break;
            System.out.println("Цей рядок не виконається.");
        }
        while (i < 5) ;

        System.out.println("Вироблено " + i + " ітерацій.");
    }
}
