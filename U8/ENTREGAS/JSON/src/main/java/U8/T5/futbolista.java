package U8.T5;

import java.util.ArrayList;

public class futbolista {
    private int numero;
    private String nombre;
    private String equipo;
    ArrayList<String> posicion = new ArrayList<>();



    public futbolista(int numero,int posicion,String nombre,String equipo){
        this.numero=numero;
        this.nombre=nombre;
        this.equipo=equipo;
        this.posicion=getPosicion();
    }

    public ArrayList<String> getPosicion() {
        return posicion;
    }

    public void setPosicion(ArrayList<String> posicion) {
        this.posicion = posicion;
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
        return "Futbolista"+numero+", "+nombre+", "+equipo;
    }
}
