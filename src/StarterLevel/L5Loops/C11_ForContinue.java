package StarterLevel.L5Loops;

public class C11_ForContinue {
    // ÷икл≥чна конструкц≥€ (цикл ≥з л≥чильником) Ц for (з пропуском ≥терац≥њ Ц continue).

    public static void main(String[] args) {
        for (int i = 0; i < 3; i++) {
            System.out.println("Counter = " + i);

            if (true) continue;

            System.out.println("÷ей р€док не виконаЇтьс€.");
        }
    }
}
