package StarterLevel.Arrays;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        ArrayList<String> cars = new ArrayList<>();
        cars.add("Volvo");
        cars.add("BMW");
        cars.add("Ford");
        cars.add("Mazda");
        cars.add("Mers");

        for (int i = 0; i < cars.size(); i++) {

            System.out.println(cars.get(i));
        }
    }
}
