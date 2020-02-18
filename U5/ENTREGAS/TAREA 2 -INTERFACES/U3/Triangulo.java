package U5.T2.U3;

public class Triangulo extends PoligonoRegular implements Figura{
    protected int altura;
    public Triangulo(){
        this.lado=lado;
        this.altura=altura;
        contadorPoligonos++;
    }

    @Override
    public float getArea(float area) {
        return area=(float)((lado*altura)/2);
    }
}
