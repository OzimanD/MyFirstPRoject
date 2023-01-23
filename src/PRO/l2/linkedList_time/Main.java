package PRO.l2.linkedList_time;

import java.util.ArrayList;
import java.util.Date;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {
        // Викликаємо метод, який вимірює час 10 тисяч вставок у список
        System.out.println(getTimeMsOfInsert(new ArrayList()));
        System.out.println(getTimeMsOfInsert(new LinkedList()));
    }

    public static long getTimeMsOfInsert(List list) {
        // Створюємо об'єкт Date
        Date currentTime = new Date();
        // Викликаємо метод insert10000
        insert10000(list);
        Date newTime = new Date();
        // Обчислюємо різницю між currentTime та newTime
        long msDelay = newTime.getTime() - currentTime.getTime();
        System.out.println("Time distance is: " + msDelay + " in ms");
        return msDelay;
    }

    public static void insert10000(List list) {
        for (int i = 0; i < 1000000; i++) {
            // Вставляємо на початок об'єкти
            list.add(0, new Object());
        }
    }
}
