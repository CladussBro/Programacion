package U8.T4;

import org.w3c.dom.*;
import org.xml.sax.SAXException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.transform.*;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ej4 {
    private String nombre;
    private int duracion;
    private String actor_principal;

    public ej4(String nombre, int duracion, String actor_principal) {
        this.nombre = nombre;
        this.duracion = duracion;
        this.actor_principal = actor_principal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getduracion() {
        return duracion;
    }

    public void setduracion(int duracion) {
        this.duracion = duracion;
    }

    public String getactor_principal() {
        return actor_principal;
    }

    public void setactor_principal(String actor_principal) {
        this.actor_principal = actor_principal;
    }

    public static void main(String[] args) {
        String nomArchivo = "cartelera";

        List<ej4> listaMusicas = new ArrayList<ej4>();

        listaMusicas.add(new ej4("Oblivion", 120, "Tom Cruise"));
        listaMusicas.add(new ej4("Scary Movie", 90, "Anna Faris"));

        try {
            leerXML();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void leerXML() {
        try {
            File archivo = new File("cartelera.xml");

            DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = factory.newDocumentBuilder();
            Document document = documentBuilder.parse(archivo);

            document.getDocumentElement().normalize();

            System.out.println("Elemento raiz: " + document.getDocumentElement().getNodeName());

            NodeList listacartelera = document.getElementsByTagName("PELICULA");

            for(int i = 0; i < listacartelera.getLength() ; i++) {
                Node nodo = listacartelera.item(i);
                System.out.println("Elemento: " + nodo.getNodeName());

                if(nodo.getNodeType() == Node.ELEMENT_NODE) {
                    Element element = (Element) nodo;
                    System.out.println("Nombre: " + element.getElementsByTagName("NOMBRE").item(0).getTextContent());
                    System.out.println("Duracion: " + element.getElementsByTagName("DURACION").item(0).getTextContent());
                    System.out.println("Actor_Principal: " + element.getElementsByTagName("ACTOR_PRINCIPAL").item(0).getTextContent());

                    System.out.println("");
                }
            }

        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    public static void crearXML(String nomArchivo, List<ej4> listacartelera)
            throws ParserConfigurationException, TransformerConfigurationException, TransformerException {
        DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();

        try {
            DocumentBuilder builder = factory.newDocumentBuilder();
            DOMImplementation implementation = builder.getDOMImplementation();
            Document document = implementation.createDocument(null, nomArchivo, null);
            document.setXmlVersion("1.0");

            // NODO RAIZ
            Element raiz = document.getDocumentElement();

            for(int i = 0 ; i <listacartelera.size() ; i++) {
                Element itemNode = document.createElement("PELICULA");

                Element idNode = document.createElement("DURACION");
                Text nodeIdValue =document.createTextNode("" +  listacartelera.get(i).getduracion());
                idNode.appendChild(nodeIdValue);

                Element nombreNode = document.createElement("ACTOR_PRINCIPAL");
                Text nodeNombreValue =document.createTextNode(listacartelera.get(i).getNombre());
                nombreNode.appendChild(nodeNombreValue);


                itemNode.appendChild(idNode);
                itemNode.appendChild(nombreNode);

                raiz.appendChild(itemNode);
            }

            // GENERA XML
            Source source = new DOMSource(document);

            // DONDE SE GUARDARA
            Result result = new StreamResult(new java.io.File(nomArchivo + ".xml"));
            Transformer transformer = TransformerFactory.newInstance().newTransformer();
            transformer.transform(source, result);

        } catch(ParserConfigurationException e) {

        }
    }
}
