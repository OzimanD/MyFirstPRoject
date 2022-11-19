package Chepter3.IF_Else_Swich;

public class C06_Ternary {
    // Тернарна умовна операція.

    public static void main(String[] args) {
        int a = 1, b = 2, c = -5, max = 0;

        max = a > b ? (c = a) : (c = b); // спочатку с = а, а потім max = c
        System.out.println(max);
    }
}
