package PRO.l2.ex_003_queue.priorityQueue;

import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        // Створюємо об'єкт класу PriorityQueue, початкова ємність - 2, а також створюємо анонімний внутрішній клас
        Queue<Integer> q = new PriorityQueue<>(2, new Comparator<Integer>() {
            @Override
            // Реалізуємо зворотний метод сортування за допомогою методу compare
            public int compare(Integer i1, Integer i2) {
                return i2 - i1;
            }
        });
        // Вставляємо елемент у чергу
        q.offer(7); // change 7
        q.offer(9); // change 9
        System.out.println(q);
        q.offer(1); // change 10
        q.offer(6); // change 11
        System.out.println(q);
        // Методом poll повертаємо та видаляємо головний елемент черги
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
        System.out.println(q.poll());
    }
}
