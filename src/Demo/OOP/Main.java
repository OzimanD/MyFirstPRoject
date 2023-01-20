package Demo.OOP;

public class Main {
    public static void main(String[] args) {
        Car BMW = new Car();
        BMW.mark = "BMW";
        BMW.price = 50000;
        BMW.model = "X5";
        BMW.speed = 250;
        BMW.maxSpeed = 300;
        System.out.println(BMW.mark + " " + BMW.price + " " + BMW.model + " " + BMW.speed + " " + BMW.maxSpeed);
        Car Mers = new Car();
        Mers.mark = "Mers";
        Mers.price = 100000;
        Mers.model = "G55";
        Mers.speed = 270;
        Mers.maxSpeed = 350;
        System.out.println(Mers.mark + " " + Mers.price + " " + Mers.model + " " + Mers.speed+ " " +Mers.maxSpeed);

    }
}
