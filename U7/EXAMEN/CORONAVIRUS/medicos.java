package U7.CORONAVIRUS;

import java.util.HashMap;

public class medicos {
    private String nombre;
    private String apellidos;
    private int num_colegiado;
    private String hospital;

    public medicos(String nombre, String apellidos,int num_colegiado,String hospital) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.num_colegiado=num_colegiado;
        this.hospital=hospital;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getNum_colegiado() {
        return num_colegiado;
    }
    public void setNum_colegiado(int num_colegiado) {
        this.num_colegiado = num_colegiado;
    }

    public String getHospital() {
        return hospital;
    }
    public void setHospital(String hospital) {
        this.hospital = hospital;
    }

    @Override
    public String toString() {
        return "Nombre='" + nombre + '\n'+
                ", apellidos=" + apellidos +'\n'+
                ", num_colegiado=" + num_colegiado +'\n'+
                ", hospital=" + hospital;
    }
}
