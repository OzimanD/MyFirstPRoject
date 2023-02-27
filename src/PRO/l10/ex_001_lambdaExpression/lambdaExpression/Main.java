package PRO.l10.ex_001_lambdaExpression.lambdaExpression;

import static java.lang.System.out;

public class Main {
    public static void fire(Object sender) {
        out.println("Fire!!!");
    }

    public static void main(String[] args) {
        Switcher sw = new Switcher();
        Lamp lamp = new Lamp();
        Radio radio = new Radio();

        // Підписка на подію(Підписуємося 1 раз і не залежно скільки разів
        // викликається включення лампи, стільки разів буде викликатися метод лампи)
        sw.addElectricityListener(lamp);
        sw.addElectricityListener(radio);

        // Захоплення змінних можемо передати в анонімний клас/лямбда вираз
        String message = "Пожежа";
        // Якщо змінюємо значення змінної – помилка компіляції
        // message = "Fire";

        /* Лямбда-вираз
            1) Якщо ми маємо 1 параметр, то ми можемо не вказувати тип параметра
            2) Круглі дужки можна опустити
        */
        sw.addElectricityListener(sender -> out.println(message));

//        sw.addElectricityListener(sender ->
//        {
//            out.print("Пожар");
//            out.println("!!!");
//        });

//        sw.addElectricityListener((Object sender) -> out.println("Пожар"));

// ============================================================

//        sw.addElectricityListener(s -> Main.fire(s));

        // :: - в даному випадку вказує на те, що використовуємо саме метод fire
        // скорочення з "::" можливо тоді, коли в методі кількість параметрів збігається з лямбда-виразом
        sw.addElectricityListener(Main::fire);

        sw.switchOn();
    }
}
