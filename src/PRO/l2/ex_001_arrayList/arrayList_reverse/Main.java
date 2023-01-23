package PRO.l2.ex_001_arrayList.arrayList_reverse;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class Main {
    public static void main(String[] args) throws Exception {
        // Створюємо об'єкт arrayList
        ArrayList<String> list = new ArrayList<>();

        // Створюємо об'єкт BufferedReader для подальшого введення з клавіатури
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

        // Циклом заповнюємо масив arrayList значеннями
        for (int i = 0; i < 3; i++) {
            System.out.println("Введіть значення [" + i + "]");
            String s = reader.readLine();
            // Додаємо значення в кінець масиву
            list.add(s);
        }

        // Циклом проходимо по всій довжині arrayList
        for (int i = 0; i < 3; i++) {
            // Записуємо значення останнього елемента у змінну j
            int j = list.size() - i - 1;
            // Виводимо на екран вміст j
            System.out.println(list.get(j));
        }
    }
}
