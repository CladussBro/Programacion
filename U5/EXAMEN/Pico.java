package U5.EXAMEN;

public class Pico extends Herramientas implements Minar{
    private int grosor;

    public Pico(String nombre, int masa, int quemarse, int diluirse, boolean moverse,int grosor) {
        super(nombre, masa, quemarse, diluirse, moverse);
        this.grosor=grosor;
    }

    @Override
    public String toString() {
        return (super.toString());
    }


    @Override
    public int Hacer(int masa) { return masa+100;}

    @Override
    public int Deshacer(int masa) {return masa-100;}
}
