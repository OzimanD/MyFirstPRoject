package PRO.l7.ex_001_serialization.serialization;

import java.io.*;

public class Main {
    public static void main(String[] args) throws Exception{
        // Створюємо об'єкт класу файл та вказуємо файл
        File f = new File("C:\\other\\CucumberFramework\\MyFirstPRoject\\src\\PRO\\l7\\ex_001_serialization\\serialization\\file1.txt");
        Car c = new Car(5000, "BMW");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        // Серіалізуємо об'єкт Car у байт-код
        oos.writeObject(c);
        oos.flush();
        oos.close();

        ObjectInputStream ois = new ObjectInputStream(new FileInputStream(f));
        Car newCar = (Car) ois.readObject();
        ois.close();
        System.out.println(newCar.price + " " + newCar.model);

    }
}
