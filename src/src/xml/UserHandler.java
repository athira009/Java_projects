package xml;
//SAX parser //reades the document node by node
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.ParserConfigurationException;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.File;
import java.io.IOException;


/**
 * Created by expert on 8/9/18.
 */
public class UserHandler extends DefaultHandler{
    boolean Name=false;
    boolean price=false;
    boolean description=false;
    boolean calories = false;

    @Override
    public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
     if (qName.equalsIgnoreCase("food")) {
         String label = attributes.getValue("label");
         System.out.println("start element is "+qName);
         System.out.println("label : " + label);
     } else if (qName.equalsIgnoreCase("name")){
         Name=true;
     }else if (qName.equalsIgnoreCase("price")){
         price=true;
     }else if (qName.equalsIgnoreCase("description")){
         description=true;
     }else if (qName.equalsIgnoreCase("calories")){
         calories=true;
     }
    }

    @Override
    public void endElement(String uri, String localName, String qName) throws SAXException {
        if (qName.equalsIgnoreCase("food") ){
            System.out.println("end element is "+qName);

    }}

    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {

        if (Name){
            String s=new String(ch,start,length);
            System.out.println("name:"+ s);
            Name=false;
        }else if (price){
            String s=new String(ch,start,length);
            System.out.println("price:"+ s);
            price=false;
        }else if (description){
            String s=new String(ch,start,length);
            System.out.println("description:"+ s);
            description=false;
        }else if (calories){
            String s=new String(ch,start,length);
            System.out.println("calories:"+ s);
            calories=false;

        }
        }

    public static void main(String[] args) throws IOException, SAXException, ParserConfigurationException {
        File inputFile=new File("Sample.txt");
        SAXParserFactory factory=SAXParserFactory.newInstance();//creating obj of saxparserfactory
        SAXParser parser=factory.newSAXParser();//creating obj of sax parser// only can be created after creation of SAXParser factory
        UserHandler handler=new UserHandler();//creating obj of event builder
        parser.parse(inputFile,handler);//passing obj to in built function parse

    }

}
