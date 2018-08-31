package xml;
//DOC parser ///reads the whole document
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import java.io.File;

/**
 * Created by expert on 8/8/18.
 */
public class DocParser {
    public static void main(String[] args) {
        try {
            File inputFile = new File("Sample.txt");
            DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();//for reading documents
            Document doc=dBuilder.parse(inputFile);
          //  doc.getDocumentElement().normalize();//for removing null elements if it exists
            System.out.println("root element :" +doc.getDocumentElement().getNodeName());
            NodeList nList=doc.getElementsByTagName("food");

            for (int temp=0;temp<nList.getLength();temp++){
                Node nNode=nList.item(temp);
                System.out.println("\nCurrent Element : "+nNode.getNodeName());
                 if (nNode.getNodeType()==Node.ELEMENT_NODE){
                     Element eElement=(Element) nNode;
                     System.out.println("food label :"+eElement.getAttribute("label"));
                     System.out.println("First Name :"+eElement.getElementsByTagName("name").item(0).getTextContent());
                     System.out.println("price :"+eElement.getElementsByTagName("price").item(0).getTextContent());
                     System.out.println("description :"+eElement.getElementsByTagName("description").item(0).getTextContent());

                 }


            }

        }catch (Exception e){
            System.out.println(e);
        }
    }
}
