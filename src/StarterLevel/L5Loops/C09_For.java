package StarterLevel.L5Loops;

public class C09_For {
    // Циклічна конструкція – for (цикл із лічильником).

    public static void main(String[] args) {
        // for (Ініціалізація лічильника ітерацій; Умова; Зміна лічильника) { Тіло циклу}

        for (int i = 0; i < 5; i++) {
            System.out.println("Counter = " + i);
        }

        //counter = 0; //  counter – недоступний за межами циклу for.
    }
}
