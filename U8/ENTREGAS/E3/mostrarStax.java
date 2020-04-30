package U8.E3;

import javax.xml.namespace.QName;
import javax.xml.stream.XMLEventReader;
import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamException;
import javax.xml.stream.events.*;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.ArrayList;

public class mostrarStax {
    public static void main(String[] args) {

        ArrayList<personas> personass = new ArrayList<>();
        U8.E3.personas personaActual = null;
        String tagActual="";


        try {
            XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
            XMLEventReader xmlReader = xmlInputFactory.createXMLEventReader(new FileInputStream("personass.xml"));

            while (xmlReader.hasNext()){
                XMLEvent xmlEvent = xmlReader.nextEvent();
                if (xmlEvent.isStartElement()) {
                    StartElement startTag = xmlEvent.asStartElement();
                    System.out.print("<"+ startTag.getName().getLocalPart());
                    String tagName = startTag.getName().getLocalPart();
                    switch (tagName) {
                        case "persona" :
                            personaActual = new personas("Claudia","Borrachero","20");
                            tagActual = "persona";

                            Attribute id = startTag.getAttributeByName(new QName("nombre"));

                            personaActual.setnombre(String.valueOf(id.getValue()));

                            System.out.print(" "+id.getName()+"=\""+id.getValue()+"\"");
                            break;

                        case "nombreProducto" :
                            tagActual = "nombreProducto";
                            break;

                        case "fecha" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "fecha";
                            break;

                        case "precio" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "precio";
                            break;

                        case "cantidad" :
                            //Establezco cuál es la etiqueta que estoy tratando
                            tagActual = "cantidad";
                            break;
                    }

                    System.out.print(">");

                } else if (xmlEvent.isEndElement()) {
                    EndElement endtag = xmlEvent.asEndElement();
                    System.out.println("<\\" + endtag.getName().getLocalPart()+">");
                    if (endtag.getName().getLocalPart().equals("persona")) {
                        personass.add(personaActual);
                    }
                    tagActual = "";

                } else if (xmlEvent.isStartDocument()) {
                    System.out.println("Comienzo del parseado del documento");

                } else if (xmlEvent.isEndDocument()) {
                    System.out.println("Fin del parseado del documento");

                } else if (xmlEvent.isCharacters()) {
                    Characters texto = xmlEvent.asCharacters();
                    if (!texto.getData().contains("\n")) {
                        System.out.print(texto.getData());
                    }
                    if (!tagActual.equals("")) {
                        switch (tagActual) {
                            case "nombre" :
                                personaActual.setnombre(texto.getData());
                                break;
                            case "apellido" :
                                personaActual.setapellido(texto.getData());
                                break;
                            case "edad" :
                                personaActual.setedad(texto.getData());
                                break;
                        }
                    }
                }

            }
        } catch (FileNotFoundException | XMLStreamException e) {
            System.out.println(e.getMessage());
        }

        System.out.println(personass);

    }
}
