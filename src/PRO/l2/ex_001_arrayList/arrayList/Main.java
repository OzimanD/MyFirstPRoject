package PRO.l2.ex_001_arrayList.arrayList;

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

        // Видаляємо останній рядок і додаємо його на початок
        for (int i = 0; i < 5; i++) {
            String s1 = list.remove(list.size() - 1);
            list.add(0, s1);
        }

        // Виводимо на екран весь вміст
        for (String temp : list) {
            System.out.println(temp);
        }
    }
}
