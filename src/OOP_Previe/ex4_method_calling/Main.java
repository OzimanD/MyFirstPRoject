package OOP_Previe.ex4_method_calling;

public class Main {
    public static void main(String[] args) {

        Car car1 = new Car();
        Car car2 = new Car();

        // викликаємо метод класу Car через об'єкт car1
        car1.setMaxSpeed(140);
        int speed = car1.getMaxSpeed();
        System.out.println(speed);

        // викликаємо метод класу Car через об'єкт car2
        // car2.maxSpeed; // до приватних не маємо доступу з інших класів
        car2.setMaxSpeed(150);
        System.out.println(car2.getMaxSpeed());
    }
}
