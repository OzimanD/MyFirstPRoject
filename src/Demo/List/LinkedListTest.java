package Demo.List;

import java.util.LinkedList;

public class LinkedListTest {
    public static void main(String[] args) {

        LinkedList<String> cars = new LinkedList<>();

        cars.add("Volvo");

        cars.add("BMW");

        cars.add("Ford");

        cars.add("Mazda");
        cars.addLast("Ford");
        cars.addFirst("Tavria");
        cars.removeFirst();
        cars.removeLast();
        System.out.println(cars.getFirst());
        System.out.println(cars.getLast());

        System.out.println(cars);

    }

}