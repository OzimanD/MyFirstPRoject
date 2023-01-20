package Demo.methodsOfClass;

import static Demo.methodsOfClass.Car.MessagePrice;

public class Main {
    public static void main(String[] args) {
        MessagePrice();//static method
        Car car = new Car();
        car.msgSpeed();
        car.a = 7;

    }
}
