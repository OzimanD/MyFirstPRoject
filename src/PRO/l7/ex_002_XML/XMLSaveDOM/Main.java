package PRO.l7.ex_002_XML.XMLSaveDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // Отримуємо об'єкт DocumentBuilder
            DocumentBuilder db = dbf.newDocumentBuilder();

            // Створюємо чистий документ
            Document doc = db.newDocument();

            // Повертає об'єкт класу Element, створюємо каталог
            Element rootElement = doc.createElement("other");
            doc.appendChild(rootElement);

            // book1
            Element book1 = doc.createElement("book1");
            // book1 заносимо до каталогу
            rootElement.appendChild(book1);

            Element author1 = doc.createElement("author");
            author1.setTextContent("Author 7");
            book1.appendChild(author1);

            // book2
            Element book2 = doc.createElement("book2");
            // book2 заносимо до каталогу
            rootElement.appendChild(book2);

            Element author2 = doc.createElement("author");
            author2.setTextContent("Author 2");
            book2.appendChild(author2);

            // save
            // Трансформери - беруть дані з одного методу, трансформують за деяким алгоритмом та перекладають в інший метод
            TransformerFactory tf = TransformerFactory.newInstance();
            Transformer t = tf.newTransformer();
            // Схожа ієрархія на I/O
            DOMSource source = new DOMSource(doc);
            StreamResult sr = new StreamResult(new File("C:\\007_Samples\\src\\com\\itvdn\\javaProfessional\\ex_002_XML\\XMLSaveDOM\\3.xml"));

            // Трансформуємо із джерела у файл
            t.transform(source, sr);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}