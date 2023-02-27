package PRO.l7.ex_002_XML.XMLParser;

public class Main {
    public static void main(String[] args) {
        // Зчитуємо файл.xml
        XMLParser xml = new XMLParser("C:\\other\\CucumberFramework\\MyFirstPRoject\\" +
                "src\\PRO\\l7\\ex_002_XML\\XMLParser\\1.xml");
        // Вказуємо шлях, що зчитуватимемо з файлу xml
        String value = xml.get("catalog/book2/price");
        System.out.println(value);
    }
}
