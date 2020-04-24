package U8.E1;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;
import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class sax extends DefaultHandler {
    public sax() {
        super();
    }
    @Override
    public void startDocument() throws SAXException {
        super.startDocument();
    }
    @Override
    public void endDocument() throws SAXException {
        super.endDocument();
    }
    @Override
    public void startElement(String nombre, String apellidos, String edad, Attributes attributes) throws SAXException {
        super.startElement(nombre, apellidos, edad, attributes);
        System.out.print("<"+edad);
        if (attributes != null) {
            for (int i = 0; i < attributes.getLength(); i++) {
                System.out.print(" "+attributes.getQName(i)+"=\""+attributes.getValue(i)+"\"");
            }
        }
        System.out.print(">");
    }
    @Override
    public void endElement(String nombre, String apellidos, String edad) throws SAXException {
        super.endElement(nombre, apellidos, edad);

        System.out.print("</"+edad+">");

    }
    @Override
    public void characters(char[] ch, int start, int length) throws SAXException {
        super.characters(ch, start, length);

        String content = new String(ch,start,length);
        System.out.print(content);
    }
    public static void main(String[] args) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("ej1.xml"));

            System.out.println("Nodos hijos de todo el Documento:"+doc.getChildNodes().getLength());

            Element root = doc.getDocumentElement();

            System.out.println("Nodos hijos del elemento raíz:"+root.getChildNodes().getLength()+"!!!!!");

            NodeList nl = root.getChildNodes();

            System.out.println("Información de los Nodos");

            for (int i = 0; i < nl.getLength() ; i++) {
                System.out.println("Tipo del Nodo:"+nl.item(i).getNodeType());


                System.out.println("Contenido del Nodo:"+nl.item(i).getTextContent());
                System.out.println("-------------------------------------------------");
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}
