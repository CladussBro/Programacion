package U5.T2.U3;

public class Circulo extends PoligonoRegular implements Figura{
    protected int radio;
    public Circulo(){
        this.lado=lado;
        this.radio=radio;
        contadorPoligonos++;
    }

    @Override
    public float getArea(float area) {
        return area=(float)(Math.PI*(Math.pow(radio,2)));
    }
}
