package PRO.l7.ex_002_XML.XMLParserDOM;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

public class Main {
    public static void main(String[] args) {
        try {
            File xmlFile = new File("C:\\other\\CucumberFramework\\MyFirstPRoject\\src\\PRO\\l7\\ex_002_XML\\XMLParserDOM\\1.xml");

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            // �������� ��'��� DocumentBuilder
            DocumentBuilder db = dbf.newDocumentBuilder();

            // ������� ��'��� DocumentBuilder � �������� ��'��� Document
            Document doc = db.parse(xmlFile);

            // ������� ��'��� ����� Element, �������� ��������� �������
            Element root = doc.getDocumentElement();
            System.out.println("��������� �������: " + root.getNodeName());
            System.out.println("----------------------");

            // ��� ���������� �������� ��������� ����� getChildNodes
            NodeList nl = root.getChildNodes();

            for (int i = 0; i < nl.getLength(); i++) {
                // �� ������� �������� �����
                Node node = nl.item(i);
                // ���������� ������ ���, ���� ����� � ���������, �� ������� �� ���
                if (node.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) node;
                    System.out.println("Book:");
                    System.out.println("Author: " + element.getElementsByTagName("author").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("Title: " + element.getElementsByTagName("title").item(0).getChildNodes().item(0).getNodeValue());
                    System.out.println("----------------------");
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}