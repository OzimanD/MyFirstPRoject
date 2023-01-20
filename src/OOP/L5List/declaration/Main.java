package OOP.L5List.declaration;

public class Main {
    public static void main(String[] args) {
        // оголошення масиву
        int[] arr1;
        int arr2[]; // не рекомендується
        arr1 = new int[5]; // оголосили розмірність 5 елементів
        int[] arr3 = new int[100];

        int[] arr4 = {12, 25, 33, 41, 13, 98}; // розмір масиву 6

        System.out.println(arr4.length); //  довжина масиву
    }
}
