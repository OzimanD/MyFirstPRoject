package OOP.L1Previev.ex11_packages06_import_static;

import static java.lang.Math.PI;
import static java.lang.Math.cos;

public class Main {
    public static void main(String[] args) {

        // зробили статичний імпорт, що дозволило нам оптимізувати код

        double number = 1;
        double result = cos(PI * number);
    }
}
