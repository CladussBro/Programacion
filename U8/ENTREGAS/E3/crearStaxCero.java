package U8.E3;

import javax.swing.text.Document;
import javax.xml.stream.*;
import javax.xml.stream.events.*;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.util.ArrayList;

public class crearStaxCero {
    public static void main(String[] args) {

        ArrayList<personas> personass = new ArrayList<>();

        //Creo los objeto necesarios para
        personas p1 = new personas("Clau","Borrachero","20");
        personas p2 = new personas("Carla","Carla","20");
        personas p3 = new personas("Celia","Celia","10");
        personas p4 = new personas("Carlota","Carlota","29");
        personas p5 = new personas("Charo","Charo","56");
        personas p6 = new personas("Charles","Vino","24");
        personas p7 = new personas("Clodet","Monet","18");
        personas p8 = new personas("Colo","Azul","30");
        personas p9 = new personas("Celeste","Cielo","56");
        personas p10 = new personas("Cintia","Go","32");

        //Los añado a la lista
        personass.add(p1);
        personass.add(p2);
        personass.add(p3);
        personass.add(p4);
        personass.add(p5);
        personass.add(p6);
        personass.add(p7);
        personass.add(p8);
        personass.add(p9);
        personass.add(p10);


        try {
            XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newInstance();
            XMLEventWriter xmlWriter = xmlOutputFactory.createXMLEventWriter(new FileOutputStream("New_personas.xml"));
            XMLEventFactory eventFactory = XMLEventFactory.newInstance();
            StartDocument startDocument = eventFactory.createStartDocument();
            xmlWriter.add(startDocument);
            Characters saltoDeLinea = eventFactory.createCharacters("\n");
            Characters saltoDeLineaTab = eventFactory.createCharacters("\n\t");
            Characters tabulador = eventFactory.createCharacters("\t");
            xmlWriter.add(saltoDeLinea);

            StartElement personasStartElement = eventFactory.createStartElement("","","peronas");
            xmlWriter.add(personasStartElement);
            xmlWriter.add(saltoDeLineaTab);
            int longitud = 0;

            for (personas p : personass) {
                StartElement personasStart = eventFactory.createStartElement("","","persona");
                StartElement nombreStart = eventFactory.createStartElement("","","nombre");
                StartElement apellidoStart = eventFactory.createStartElement("","","apellido");
                StartElement edadStart = eventFactory.createStartElement("","","edad");


                EndElement personaEnd = eventFactory.createEndElement("","","persona");
                EndElement nombreEnd = eventFactory.createEndElement("","","nombre");
                EndElement apellidoEnd = eventFactory.createEndElement("","","apellido");
                EndElement edadEnd = eventFactory.createEndElement("","","edad");

                Characters nombre = eventFactory.createCharacters(p.getnombre());
                Characters apellido  = eventFactory.createCharacters(p.getapellido());
                Characters edad = eventFactory.createCharacters(p.getedad());

                xmlWriter.add(personasStart);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);

                xmlWriter.add(nombreStart);
                xmlWriter.add(nombre);
                xmlWriter.add(nombreEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(apellidoStart);
                xmlWriter.add(apellido);
                xmlWriter.add(apellidoEnd);
                xmlWriter.add(saltoDeLineaTab);
                xmlWriter.add(tabulador);
                xmlWriter.add(edadStart);
                xmlWriter.add(edad);
                xmlWriter.add(edadEnd);
                xmlWriter.add(saltoDeLineaTab);

                xmlWriter.add(personaEnd);
                if (longitud == personass.size() - 1) {
                    xmlWriter.add(saltoDeLinea);
                } else {
                    xmlWriter.add(saltoDeLineaTab);
                }
                longitud++;

            }
            EndElement personasEndElement = eventFactory.createEndElement("","","personas");
            xmlWriter.add(personasEndElement);
            xmlWriter.add(saltoDeLinea);

            EndDocument endDocument = eventFactory.createEndDocument();
            xmlWriter.add(endDocument);


        } catch (XMLStreamException | FileNotFoundException e) {
            System.out.println(e.getStackTrace());
        }


    }
}
