package U5.EXAMEN;

import U5.EXAMEN.Materiales;

public class Cristal extends Materiales implements Mezclar{

    private Object tipo;

    protected enum tipo{TRANSPARENTE,TRANSLUCIDO};

    public Cristal(String nombre, int masa, int quemarse, int diluirse, boolean moverse,tipo tipo) {
        super(nombre, masa, quemarse, diluirse, moverse);
        tipo=tipo;
    }

    @Override
    public String toString() {
        return ("Nombre: "+nombre+" Masa: "+masa+" Quemarse: "+quemarse+" Diluirse: "+diluirse+" Moverse: "+moverse+" Tipo: "+tipo);
    }

    @Override
    public void MezclarConMaterial(Object o1,Object o2) {}
}
