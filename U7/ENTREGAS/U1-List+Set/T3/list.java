package U7.U1.T3;

import java.util.LinkedList;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<Integer> lista = new LinkedList<>();

        lista.add((int)(Math.random()*10));

        for (int i = 0; i < 20; i++) {
            Integer temp=(int)(Math.random()*10);
            int insercion=0;
            while(insercion<1 && temp <lista.get(insercion)){
                lista.add(insercion,temp);
            }
            System.out.println("Números ordenados en orden decreciente:");
            System.out.println(lista);
        }

    }
}
