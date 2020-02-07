package U5.ENTREGA;

import java.util.Comparator;

public class Terrestre extends Vehiculo implements Comparator {
    public String matricula="";
    public int año_matriculacion;
    public enum color { AZUL, AMARILLO, ROJO, VERDE }
    color color;

    public Terrestre(String nombre,String matricula,int año_matriculacion, color color,int num_personas){
        this.nombre=nombre;
        this.matricula=matricula;
        this.año_matriculacion=año_matriculacion;
        this.color=color;
        this.num_personas=num_personas;
    }

    @Override
    public String toString() {
        return ("Nombre: "+nombre+" Matricula: "+matricula+" Año Matriculacion: "+año_matriculacion+
                " Color: "+color+" Num Personas: "+num_personas);
    }

    @Override
    public int compare(Object o1, Object o2) {
        return ((Coche) o1).año_matriculacion - ((Coche) o2).año_matriculacion;
    }

    @Override
    public boolean equals(Object obj) {
        return matricula.equals(((Coche) obj).matricula);
    }
}
