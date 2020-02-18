package U5.T2.U2;

public class Cliente implements Comparable{
    protected String dni;
    protected String nombre;
    protected int edad;
    protected double saldo;

    public Cliente(String dni,String nombre,int edad,double saldo){
        this.dni=dni;
        this.nombre=nombre;
        this.edad=edad;
        this.saldo=saldo;
    }

    @Override
    public boolean equals(Object otro) {
        return dni.equals(((Cliente)otro).dni);
    }

    @Override
    public String toString() {
        return "DNI: "+dni+" Nombre: "+nombre+" Edad: "+edad+" Saldo: "+saldo;
    }

    @Override
    public int compareTo(Object otro) {
        return dni.compareTo(((Cliente)otro).dni);
    }
}
