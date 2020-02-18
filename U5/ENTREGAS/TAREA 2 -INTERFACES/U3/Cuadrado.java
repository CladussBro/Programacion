package U5.T2.U3;

public class Cuadrado extends PoligonoRegular implements Figura{
    public Cuadrado(int lado){
        this.lado=lado;
        contadorPoligonos++;
    }

    @Override
    public float getArea(float area) {
        return area=(float)Math.pow(lado,2);
    }
}
