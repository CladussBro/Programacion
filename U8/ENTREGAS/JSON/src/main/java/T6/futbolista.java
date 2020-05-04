package T6;

import java.util.ArrayList;

public class futbolista {
    private int numero;
    private String nombre;
    private String equipo;
    private ArrayList<posicion> posi;


    public futbolista(int numero,String nombre,ArrayList<String>posicion,String equipo){
        this.numero=numero;
        this.nombre=nombre;
        this.posi=posi;
        this.equipo=equipo;
    }

    public ArrayList<posicion> getPosi() {
        return posi;
    }

    public void setPosi(ArrayList<posicion> posi) {
        this.posi = posi;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista: "+numero+", nombre: "+nombre+
                ", equipo: "+equipo+", posición: "+posi;
    }
}
