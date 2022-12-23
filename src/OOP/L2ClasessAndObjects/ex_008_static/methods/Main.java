package OOP.L2ClasessAndObjects.ex_008_static.methods;

public class Main {
    private int count;

    public static void main(String[] args) {
        // виклик статичного методу за допомогою класу
        Main.doSmth(); // через Клас
        doSmth();      // у самому класі, без використання класу

        // виклик не статичного методу або поля зі статичного контексту заборонено та призводить до помилки компіляції
        // System.out.println(Main.count);
    }
    public static void doSmth() {
        System.out.println("Hello !");
    }
}