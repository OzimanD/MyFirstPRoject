package OOP.L5List.class_arrays;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        // методи класу Arrays
        int[] arr = {2, 12, 3, 124, 55, 22};
        int[] arr2 = {56, 78, 23};

        // Сортування масиву
        Arrays.sort(arr);

        // виведення масиву (виводить місце в пам'яті, яке займає масив)
        System.out.println(arr);

        // через метод toString виводимо його вміст
        System.out.println(Arrays.toString(arr));

        // пошук елемента в масиві
        System.out.println(Arrays.binarySearch(arr, 12));

        // порівнює масиви
        System.out.println(Arrays.equals(arr, arr2));

        // вставити елемент у масив
        Arrays.fill(arr, 12);
        System.out.println(Arrays.toString(arr));
    }
}
