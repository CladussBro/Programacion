package U7.U2.T1;

import java.util.HashSet;
import java.util.Set;

public class union {
    static Set union (Set conjunto1, Set conjunto2){
        Set resultado=new HashSet(conjunto1);
        resultado.addAll(conjunto2);
        return resultado;
    }

    public static void main(String[] args) {
        Set <Integer> s1=new HashSet<>();
        Set <Integer> s2=new HashSet<>();

        for (int i = 1; i <= 6; i++) {
            s1.add(i);
        }
        for (int i = 5; i <= 10; i++) {
            s2.add(i);
        }
        System.out.println("Conjunto 1:\n"+s1);
        System.out.println("Conjunto 2:\n"+s2);
        System.out.println("Conjunto de union:\n"+union(s1,s2));;
    }
}
