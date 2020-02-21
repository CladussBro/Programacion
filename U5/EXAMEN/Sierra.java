package U5.EXAMEN;

public class Sierra extends Herramientas{
    private int diametro;

    public Sierra(String nombre, int masa, int quemarse, int diluirse, boolean moverse,int diametro) {
        super(nombre, masa, quemarse, diluirse,moverse);
        this.diametro=diametro;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
