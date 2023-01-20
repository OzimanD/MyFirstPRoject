package Demo.methodsOfClass;

public class Car {
    int a = 8;
    public void msgSpeed(){
        System.out.println("Max Speed");
    }

    static void MessagePrice(){
        System.out.println("Max Price");
    }

    public static void main(String[] args) {
        MessagePrice();//static method
        Car car = new Car();
        car.msgSpeed();//public method
    }
}
