package PRO.l2.ex_004_set.hashSet;

import java.util.HashSet;
import java.util.Set;

public class Main {
    public static void main(String[] args){
        //
        //Створюємо колекцію хеш-сет
        Set<String> set = new HashSet<>();
        set.add("кавун");
        set.add("банан");
        set.add("диня");
        set.add("суниця");
        set.add("ірис");
        set.add("картопля");
        for (String text : set) {
            System.out.println(text + " " + text.hashCode());
        }
    }
}
