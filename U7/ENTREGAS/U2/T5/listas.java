package U7.U2.T5;

import java.util.ArrayList;
import java.util.List;

public class listas {
    static List<Integer> fusion(List<Integer>lista1,List<Integer>lista2) {
        List<Integer> resultado = new ArrayList<>();
        int i = 0, j = 0;
        while (i < lista1.size() && j < lista2.size()) {
            if (lista1.get(i) < lista2.get(j)) {
                resultado.add(lista1.get(i));
                i++;
            } else {
                resultado.add(lista2.get(j));
                j++;
            }
        }
        while (i < lista1.size()) {
            resultado.add(lista1.get(i));
            i++;
        }
        while(j<lista2.size()){
            resultado.add(lista2.get(j));
            j++;
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Integer> l1=new ArrayList<>();
        List<Integer> l2=new ArrayList<>();
        l1.add(1);l1.add(2);l1.add(5);l1.add(7);l1.add(10);
        l2.add(1);l2.add(3);l2.add(4);l2.add(8);l2.add(10);l2.add(12);l2.add(12);l2.add(15);l2.add(18);

        System.out.println("Lista 1:"+l1);
        System.out.println("Lista 2:"+l2);
        System.out.println("Fusion:"+fusion(l1,l2));
    }
}
