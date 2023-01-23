package PRO.l1.interface_comparator;

import static java.util.Arrays.*;

public class Main {
    public static void main(String[] args) {
        Car c1 = new Car(190, 8000, "BMW", "Red");
        Car c2 = new Car(140, 2000, "Opel", "Black");
        Car c3 = new Car(185, 10000, "Mercedes", "White");
        Car[] c = {c1, c2, c3};

        sort(c, new ComparatorByPrice());
        for (Car temp : c) {
            System.out.println(temp);
        }
        System.out.println();

        sort(c, new ComparatorBySpeed());
        for (Car temp : c) {
            System.out.println(temp);
        }
        System.out.println();

        sort(c, new ComparatorByColor());
        for (Car temp : c) {
            System.out.println(temp);
        }
    }
}
