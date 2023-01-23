package PRO.l2.ex_004_set.treeSet;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        NavigableSet<Integer> ts = new TreeSet<>();
        ts.add(7);
        ts.add(2);
        ts.add(14);
        NavigableSet<Car> tc = new TreeSet<>();
        // Додаємо об'єкт Car до колекції
        tc.add(new Car(5000));
        tc.add(new Car(3000));
        System.out.println(tc);
        // Створюємо підколекцію headSet, не більше цифри 5, true - включно
        NavigableSet<Integer> ts1 = ts.headSet(5, true);
        System.out.println(ts1);
        ts1.add(3);
        System.out.println(ts);
        System.out.println(ts1);
        ts.add(8);
        System.out.println(ts + "\n" + ts1);
//        ts1.add(6);    // У підколекціях не можна виходити за межі IllegalArgumentException
        Iterator<Integer> iterator = ts.iterator(); // За допомогою методу ітератора ми отримали примірник interface iterator
        while (iterator.hasNext()) {
            Integer temp = iterator.next();
            temp++; // Не змінюється значення temp
//            System.out.println(iterator.next());
        }
        System.out.println(ts);
        // Iterator izmenil zna4enue y polei objecta
        Iterator<Car> carIterator = tc.iterator();
        while (carIterator.hasNext()) {
            Car temp = carIterator.next();
            temp.price++; // Змінюємо значення поля об'єкта на 1
//            System.out.println(iterator.next());
        }
        System.out.println(tc);
    }
}

class Car implements Comparable<Car> {
    int price;

    Car(int price) {
        this.price = price;
    }
    
    public String toString() {
        return "" + this.price;
    }

    public int compareTo(Car c) {
        return this.price - c.price;
    }
}
