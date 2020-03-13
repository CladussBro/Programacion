package U7.U1.T5;

import U7.U1.T5.decreciente;

import java.util.Set;
import java.util.TreeSet;

public class main {
    public static void main(String[] args) {
        Set<Integer> num = new TreeSet<>(new decreciente());

        while(num.size()<20){
            Integer temp=(int)(Math.random()*100);
            num.add(temp);
        }

        System.out.println("Números ordenados en orden decreciente:");
        System.out.println(num);
    }
}
