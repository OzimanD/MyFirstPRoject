package OOP_Previe.ex2_access_modifiers;

public class Main {
    public static void main(String[] args) {

        Shape shape = new Shape();

        shape.square = 24.0; // доступ до public поля
        System.out.println(shape.square);

        //задаємо параметри нашому об'єкту

        shape.setHeight(200);
        shape.getHeight();

        shape.setLength(144);
        shape.getLength();

        // виводимо об'єкт через метод

        shape.viewShape();
    }
}
