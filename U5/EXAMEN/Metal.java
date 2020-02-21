package U5.EXAMEN;

import U5.EXAMEN.Materiales;

public class Metal extends Materiales implements Mezclar{
    private boolean iman;

    public Metal(String nombre, int masa, int quemarse, int diluirse, boolean moverse,boolean iman) {
        super(nombre, masa, quemarse, diluirse, moverse);
        this.iman=iman;
    }

    @Override
    public String toString() {
        return super.toString();
    }

    @Override
    public void MezclarConMaterial(Object o1, Object o2) {

    }
}
