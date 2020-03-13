package U7.U1.T2;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T2 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Integer temp;
        for (int i = 0; i < 20; i++) {
            temp=(int)(Math.random()*100);
            lista.add(temp);
        }
        decreciente comp=new decreciente();
        Collections.sort(lista,comp);
        System.out.println("Lista en orden de decreciente: ");
        System.out.println(lista);
    }
}
