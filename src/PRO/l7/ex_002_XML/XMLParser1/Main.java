package PRO.l7.ex_002_XML.XMLParser1;

import java.io.UnsupportedEncodingException;

public class Main {
    public static void main(String[] args) throws UnsupportedEncodingException {
        // Считываем файл.xml
        XMLParser xml = new XMLParser("C:\\other\\CucumberFramework\\MyFirstPRoject" +
                "\\src\\PRO\\l7\\ex_002_XML\\XMLParser1\\2.xml");

        // Указываем путь, что будем считывать с файла xml
        String value = xml.get("catalog/book/author");
        String value1 = xml.get("catalog/book1/price");
        String val2 = xml.get("catalog/book1/title");
        System.out.println(value);
        System.out.println(value1);
        System.out.println(val2);
    }
}
