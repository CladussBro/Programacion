package U5.T2.U1;

import java.util.Arrays;

public class PilaTabla implements Pila{
    private int indiceCima;
    private Integer[] tabla;

    public PilaTabla() {
        indiceCima = -1;
        tabla = new Integer[10];
    }

    public PilaTabla(int capacidadInicial) {
        tabla = new Integer[capacidadInicial];
    }

    private boolean pilaVacia() {
        return indiceCima == -1;
    }

    private boolean pilaLlena() {
        return indiceCima == tabla.length - 1;
    }

    Integer cima() {
        Integer elementoCima = null;
        if (!pilaVacia()) {
            elementoCima = tabla[indiceCima];
        }
        return elementoCima;
    }

    @Override
    public void apilar(Integer elemento) {
        if (pilaLlena()) {
            tabla = Arrays.copyOf(tabla, tabla.length + 10);
        }
        indiceCima++;
        tabla[indiceCima] = elemento;
    }

    @Override
    public Integer desapilar() {
        Integer elemento = null;
        if (!pilaVacia()) {
            elemento=tabla[indiceCima];
            indiceCima--;
        }
        return elemento;
    }

    @Override
    public String toString() {
        String resultado = "";
        for (int i = 0; i < indiceCima; i++) {
            resultado+=tabla[i]+"";
        }
        resultado += "(cima)";
        return resultado;
    }
}
