package PRO.l2.ex_005_map.treeMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        // Створили карту зображень
        NavigableMap<String, Car> nm = new TreeMap();
        // Заповнюємо map <key, value>
        nm.put("Evgeniy", new Car(7000));
        Car c = new Car(8000);
        nm.put("Alex", c);
        nm.put("Edward", new Car(5000));
        nm.put("Edward", new Car(6000));
        // Виводимо на екран весь вміст
        System.out.println(nm);
        // Намагаємось отримати значення з ім'ям Serg
        System.out.println(nm.get("Serg"));
        // Перевіряємо, чи існує ключ у Map
        System.out.println(nm.containsKey("Ann"));
        System.out.println(nm.containsValue(new Car(8000)));
        System.out.println(nm.containsValue(c));
        // Заповнюємо ключами
        Set<String> keys = nm.keySet();
        // Заповнюємо значеннями
        Collection<Car> cars = nm.values();
        System.out.println(keys);
        System.out.println(cars);
        // Записали вміст TreeMap у Set
        Set<Map.Entry<String, Car>> s = nm.entrySet();
        System.out.println(s);
        for (Map.Entry<String, Car> temp : s) {
            temp.setValue(new Car(10000));
        }
        System.out.println(s);
    }
}

class Car {
    int price;

    Car(int price) {
        this.price = price;
    }

    public String toString() {
        return "" + this.price;
    }
}
