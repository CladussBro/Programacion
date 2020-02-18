package U5.T2.U1;

import U4.TAREA2.EJ1.Lista;

public class PilaLista implements Pila{
    private int indiceCima;
    private Lista lista;

    public PilaLista(){
        indiceCima=-1;
        lista=new Lista();
    }
    public PilaLista(int capacidadInicial){
        lista=new Lista(capacidadInicial);
    }
    private boolean pilaVacia(){
        return indiceCima==-1;
    }
    private boolean pilaLlena(){
        return lista.listaLlena();
    }
    int cima(){
        return lista.numeroElementos()-1;
    }
    @Override
    public void apilar(Integer elemento) {
        lista.insertarFinal(elemento);
        indiceCima++;
    }
    @Override
    public Integer desapilar() {
        Integer elemento=lista.eliminar(indiceCima);
        if (elemento!=null){
            indiceCima--;
        }
        return null;
    }

    @Override
    public String toString() {
        return super.toString();
    }
}
