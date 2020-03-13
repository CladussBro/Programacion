package U7.U1.T1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class T1 {
    public static void main(String[] args) {
        List<Integer> lista = new ArrayList<>();
        Integer temp;
        for (int i = 0; i < 20; i++) {
            temp=(int)(Math.random()*100);
            lista.add(temp);
        }
        System.out.println("Lista en orden de insercion: ");
        System.out.println(lista);
        Collections.sort(lista);
        System.out.println("Lista en orden de creciente: ");
        System.out.println(lista);
    }
}
