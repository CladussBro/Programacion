package U5.EXAMEN;

import U5.EXAMEN.Materiales;

public class Rocas extends Materiales implements Mezclar{
    private int dureza;

    public Rocas(String nombre, int masa, int quemarse, int diluirse, boolean moverse,int dureza) {
        super(nombre, masa, quemarse, diluirse, moverse);
        this.dureza=dureza;
    }

    @Override
    public String toString() {
        return ("Nombre: "+nombre);
    }

    @Override
    public void MezclarConMaterial(Object o1, Object o2) {

    }
}
