package OOP.L5List.rewrite;

public class Main {
    public static void main(String[] args) {
        // створення масиву розмірністю 5
        int[] arr1 = new int[5];
        System.out.println(arr1.length);

        // перезапис масиву (створили новий масив).
        // Тобто ми створили новий об'єкт (через "new") і на попередній об'єкт вже немає посилань.
        // Він потенційно може бути вилучений збирачем сміття.
        arr1 = new int[25];
        System.out.println(arr1.length);
    }
}
