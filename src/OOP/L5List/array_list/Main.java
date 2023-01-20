package OOP.L5List.array_list;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();

        arrayList.add("name");
        arrayList.add("surname");

        // задаємо місткість списку
        arrayList.ensureCapacity(30);

        // розмір списку на даний час
        System.out.println(arrayList.size());

        // дістаємо елемент за індексом
        System.out.println(arrayList.get(1));

        // Помилка IndexOutOfBoundException
        // System.out.println(arrayList.get(2));

        // дістаємо індекс об'єкту
        System.out.println(arrayList.indexOf("name"));

        // дістаємо індекс об'єкта з кінця
        System.out.println(arrayList.lastIndexOf("surname"));
    }
}
