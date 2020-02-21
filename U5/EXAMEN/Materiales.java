package U5.EXAMEN;

import java.util.Arrays;
import java.util.Comparator;

public class Materiales extends Minecraft implements Comparator {
    protected String nombre;
    protected int masa;
    protected int quemarse;
    protected int diluirse;
    protected boolean moverse=false;

    public Materiales(String nombre, int masa, int quemarse, int diluirse, boolean moverse){
        this.nombre=nombre;
        this.masa=masa;
        this.quemarse=quemarse;
        this.diluirse=diluirse;
        this.moverse=moverse;
    }

    @Override
    public String toString() {
        return ("Nombre: "+nombre+" Masa: "+masa+" Quema: "+quemarse+" Diluirse: "+diluirse+" Moverse: "+moverse);
    }

    @Override
    public int compare(Object o, Object t1) {
        return (((Materiales).o1).diluirse-((Materiales).o2).diluirse);
    }

}

