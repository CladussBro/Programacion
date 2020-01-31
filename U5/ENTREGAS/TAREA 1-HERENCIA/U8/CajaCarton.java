package U5.T1.U8;

import U5.T1.U7.Caja;

public class CajaCarton extends Caja {
    static double cartonTotal = 0;
    protected double area;

    int etiqueta;

    CajaCarton(double ancho, double alto, double fondo) {
        super(ancho, alto, fondo, CajaCarton.Unidades.CM);
        area = 2 * (ancho * alto + ancho * fondo + alto * fondo);
        cartonTotal += area;
    }

    double getArea() {
        return area;
    }

    public double getVolumen() {
        return volumen * 0.8;
    }

    @Override

    public String toString() {
        String result = "Cartón total " + cartonTotal + "cm2\n";
        result += "Área: " + area + "cm2\n";
        result += super.toString();
        return result;
    }
}
