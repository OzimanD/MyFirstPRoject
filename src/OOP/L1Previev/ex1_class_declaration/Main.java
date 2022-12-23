package OOP.L1Previev.ex1_class_declaration;

public class Main {
    public static void main(String[] args) {
        Car Volvo = new Car("Volvo", 250, 2020, 150);
        Volvo.setSpeed(100);
        System.out.println(Volvo.getModel()+" "+Volvo.getMaxSpeed()+" "+Volvo.getYear()+" "+Volvo.getSpeed());
    }
}


