import org.w3c.dom.*;

import javax.xml.parsers.*;
import java.io.*;

public class parser1 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter the xml file name: ");
        String xmlFile = br.readLine();
        File file = new File(xmlFile);
        if (file.exists()) {
            try {
                DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
                DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
                Document doc = dBuilder.parse(file);
                doc.getDocumentElement().normalize();
                System.out.println("Root element : " + doc.getDocumentElement().getNodeName());
                NodeList nList = doc.getElementsByTagName("employee");
                System.out.println("----------------------------");
                for (int i = 0; i < nList.getLength(); i++) {
                    Node nNode = nList.item(i);
                    if (nNode.getNodeType() == Node.ELEMENT_NODE) {
                        Element eElement = (Element) nNode;
                        System.out.println("Employee Name : " + eElement.getElementsByTagName("name").item(0).getTextContent());
                        System.out.println("Employee Age : " + eElement.getElementsByTagName("age").item(0).getTextContent());
                        System.out.println("Employee Salary : " + eElement.getElementsByTagName("salary").item(0).getTextContent());
                        System.out.println("----------------------------");
                    }
                }
            } catch (Exception e) {
                e.printStackTrace();
            }
        } else {
            System.out.println("File not found");
        }
    }
}