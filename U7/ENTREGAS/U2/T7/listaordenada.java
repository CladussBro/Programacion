package U7.U2.T7;

import java.util.Comparator;
import java.util.LinkedList;

public class listaordenada<E> extends LinkedList<E> {
    protected Comparator<E> comparador;

    listaordenada(Comparator c){
        super();
        comparador=c;
    }
    void insertarorden(E elemento){
        if (size()==0){
            add(elemento);
        }else{
            int indiceinserccion=0;
            while(indiceinserccion<size()&&comparador.compare(elemento,get(indiceinserccion))>0){
                indiceinserccion++;
            }
            add(indiceinserccion,elemento);
        }
    }
    static class enterosDecrecientes implements Comparator<Integer>{
        @Override
        public int compare(Integer o1,Integer o2){
            return o2-o1;
        }
    }
    static class comparacadenas implements Comparator<String>{
        public int compare(String o1,String o2){
            return o1.compareTo(o2);
        }
    }
}
