package PRO.l7.JAXB;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import java.io.File;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
        Catalog catal = new Catalog();
        catal.add(new Book("Author1", "Title1", 40.55, new Date()));
        catal.add(new Book("Author2", "Title2", 30, new Date()));
        catal.add(new Book("Author3", "Title3", 33, new Date()));

        try {
            // Створюємо файл
            File file = new File("C:\\other\\CucumberFramework\\MyFirstPRoject\\src\\PRO\\l7\\JAXB\\output.xml");
            // Викликаємо статичний метод JAXBContext
            JAXBContext jaxbContext = JAXBContext.newInstance(Catalog.class);
            // Повертає об'єкт класу Marshaller, щоб трансформувати об'єкт
            Marshaller mar = jaxbContext.createMarshaller();

            // Читабельне форматування
            mar.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

            // Записуємо у файл, marshal(з пам'яті, у файл)
            mar.marshal(catal, file);
            mar.marshal(catal, System.out);

            // Зчитуємо з файлу
            Unmarshaller unmar = jaxbContext.createUnmarshaller();
            catal = (Catalog) unmar.unmarshal(file);
            System.out.println(catal);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}