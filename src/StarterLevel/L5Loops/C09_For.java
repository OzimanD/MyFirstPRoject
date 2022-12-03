package StarterLevel.L5Loops;

public class C09_For {
    // Циклічна конструкція – for (цикл із лічильником).

    public static void main(String[] args) {
        // for (Ініціалізація лічильника ітерацій; Умова; Зміна лічильника) { Тіло циклу}

        for (int counter = 0; counter < 5; counter++) {
            System.out.println("Counter = " + counter);
        }

        //counter = 0; //  counter – недоступний за межами циклу for.
    }
}
