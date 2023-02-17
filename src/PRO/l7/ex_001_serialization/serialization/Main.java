package PRO.l7.ex_001_serialization.serialization;

import java.io.File;
import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

public class Main {
    public static void main(String[] args) throws Exception{
        // Створюємо об'єкт класу файл та вказуємо файл
        File f = new File("C:\\Users\\Admin\\OneDrive\\Рабочий стол\\Рабочий стол\\CBS\\3Продвинутый\\007_Samples\\src\\com\\" +
                "itvdn\\javaProfessional\\ex_001_serialization\\serialization\\file1.png");
        Car c = new Car(5000, "BMW");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(f));
        // Серіалізуємо об'єкт Car у байт-код
        oos.writeObject(c);
        oos.flush();
        oos.close();
    }
}
