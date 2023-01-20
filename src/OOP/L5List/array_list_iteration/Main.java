package OOP.L5List.array_list_iteration;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.ListIterator;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();

        arrayList.add(3);
        arrayList.add(5);
        arrayList.add(7);

        // за допомогою ітератора можемо бігати за нашим списком
        Iterator<Integer> iterator = arrayList.iterator();

        // питаємо чи є наступний елемент у списку, якщо true, то буде реалізовано тіло while
        while (iterator.hasNext()) {
            // переходимо до наступного елемента у списку та його виводимо
            Integer integer = iterator.next();
            System.out.println(integer);
        }
        // та ж дія, але через оптимізований ітератор під списки
        ListIterator<Integer> listIterator = arrayList.listIterator();

        while (listIterator.hasNext()) {
            Integer integer = listIterator.next();
            System.out.println(integer);
        }
    }
}
