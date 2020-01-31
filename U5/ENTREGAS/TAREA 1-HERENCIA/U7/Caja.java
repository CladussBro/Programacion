package U5.T1.U7;

public class Caja {
    private final Unidades unid;
    protected double ancho;
    protected double alto;
    protected double fondo;
    protected double volumen;

    public enum Unidades { CM, M};
    public String etiqueta;

    // Constructor
    public Caja(double ancho, double alto, double fondo, Unidades unid) {
        this.ancho=ancho;
        this.alto=alto;
        this.fondo=fondo;
        this.unid=unid;

        switch (unid) {
            case CM:
                volumen=(ancho/100) * (alto*100) * (fondo*100);
                break;
            case M:
                volumen=ancho*alto*fondo;
                break;
        }
    }

    //Metodos
    double getVolumen() {
        return volumen;
    }

    @Override
    public String toString() {
        return ancho + "*" + alto + "*" + fondo + " = " + volumen ;
    }
}
