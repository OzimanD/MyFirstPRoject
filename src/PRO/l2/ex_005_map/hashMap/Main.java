package PRO.l2.ex_005_map.hashMap;

import java.util.HashMap;
import java.util.Map;

public class Main {
    public static void main(String[] args) throws Exception {
        // Створюємо масив типу String
        String[] people = new String[]{"Євген", "Олександр", "Катерина", "Каріна", "Вероніка", "Тамара", "Сергій"};

        // Створюємо HashMap, <Ключ, значення>
        HashMap<String, Human> map = addHumansToMap(people);

        // Використовуючи методи інтерфейсу Map.Entry<Key, Value>, пробігаємо по map
        for (Map.Entry<String, Human> pair : map.entrySet()) {
            System.out.println(pair.getKey() + " - " + pair.getValue());
        }
    }

    public static HashMap<String, Human> addHumansToMap(String[] people) {
        HashMap<String, Human> allHumans = new HashMap<>();
        for (String s : people) {
            allHumans.put(s, new Human(s));
        }
        return allHumans;
    }

    public static class Human {
        String name;

        public Human(String name) {
            this.name = name;
        }

        // Перевизначаємо метод toString класу Object
        @Override
        public String toString() {  /// Alex  - >  ALEX
            return name != null ? name.toUpperCase() : null;
        }
    }
}
