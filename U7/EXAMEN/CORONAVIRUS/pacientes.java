package U7.CORONAVIRUS;

import java.util.Collection;
import java.util.TreeSet;

public class pacientes {
    private static String cepa;
    private String nombre;
    private int edad;
    private int peso;
    private boolean vacuna;
    private medicos medico;

    public pacientes(String nombre, int edad,int peso,boolean vacuna,medicos medico,String cepa) {
        this.nombre = nombre;
        this.edad=edad;
        this.peso = peso;
        this.vacuna=vacuna;
        this.medico=medico;
        this.cepa=cepa;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }
    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }
    public void setPeso(int peso) {
        this.peso = peso;
    }

    public boolean vacuna() {
        return vacuna;
    }
    public void setVacuna(boolean vacuna) {
        this.vacuna = vacuna;
    }

    public medicos getMedico() {
        return medico;
    }
    public void setMedico(medicos medico) {
        this.medico = medico;
    }

    public static String getCepa() {
        return cepa;
    }
    public void setCepa(String cepa) {
        this.cepa = cepa;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\n' +
                ", edad=" + edad + '\n'+
                ", peso=" + peso +'\n'+
                ", vacunas=" + vacuna +'\n'+
                ", medico=" + medico +'\n'+
                ", cepa='" + cepa;
    }

    public Collection<pacientes> get(String cepa) {
        return null;
    }

    public void put(String cepa, TreeSet<pacientes> pacientes) {
    }
}
