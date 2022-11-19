package Chepter3.IF_Else_Swich;

public class C05_Ternary {
    // Тернарна умовна операція.

    // Тернарний (трійковий) оператор [?:].
    // Тернарний оператор [?:], є скороченою формою конструкції if...else.
    // [?:] - включає три операнда - ( умова ? Якщо умова ІСТИНА : Якщо умова ХИБНА )

    // Алгоритм роботи тернарної операції: (логічний вираз)? вираз 1: вираз 2
    // 1. Обчислюється логічний вираз (умова).
    // 2. Якщо логічне вираз істинний, то обчислюється значення виразу виразу 1, інакше — значення виразу 2.
    // 3. Обчислене значення повертається.

    public static void main(String[] args) {
        int a = 1, b = 2, max = 0;

        // Змінній max, привласнюємо значення тернарного оператора, що повертається.

        max = (a > b) ? a : b;   // ЯКЩО: (a > b) ТО: повернути a Інакше: повернути b;
        System.out.println(max);
    }
}
