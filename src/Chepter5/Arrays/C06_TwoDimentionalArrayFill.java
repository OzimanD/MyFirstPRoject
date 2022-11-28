package Chepter5.Arrays;

public class C06_TwoDimentionalArrayFill {
    // Массивы (двумерный массив).

    public static void main(String[] args) {
        int sizeI = 3;
        int sizeJ = 3;
        int[][] array = new int[sizeI][sizeJ];

        // Заполнение массива
        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                array[i][j] = i * j + 1;
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }

        for (int i = 0; i < sizeI; i++) {
            for (int j = 0; j < sizeJ; j++) {
                System.out.print(" " + array[i][j]);
            }
            System.out.print("\n");
        }
    }
}
