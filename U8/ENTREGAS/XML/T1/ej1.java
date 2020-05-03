package U8.T1;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import java.io.File;
import java.io.IOException;

public class ej1 {
    public static void parse(String nomFile) {
        try {

            DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
            DocumentBuilder db = dbf.newDocumentBuilder();
            Document doc = db.parse(new File("ej1.xml"));

            NodeList nl = ((Document) doc).getElementsByTagName("persona");

            System.out.println("El fichero tiene "+nl.getLength()+" etiquetas persona");

            for (int i = 0; i < nl.getLength() ; i++) {
                Node nodo = nl.item(i);

                Element e = (Element) nl.item(i);
                System.out.println("Etiqueta: "+e.getTagName());

                if (nodo.getNodeType() == Node.ELEMENT_NODE) {

                    if (nodo.hasChildNodes()) {

                        System.out.println("Esta etiqueta tiene "+nodo.getChildNodes().getLength()+" nodos hijos");

                        NodeList listaInterior = nodo.getChildNodes();

                        for (int j = 0; j < listaInterior.getLength(); j++) {

                            if  (listaInterior.item(j).getNodeType() == Node.ELEMENT_NODE) {
                                Element eHijo = (Element) listaInterior.item(j);
                                System.out.println("Uno de los nodos hijos es "+eHijo.getTagName());
                                System.out.println("Contenido: "+eHijo.getTextContent());
                            }
                        }
                    }


                }
            }

        } catch (ParserConfigurationException | SAXException | IOException e) {
            System.out.println(e.getStackTrace());
        }
    }
}

