package U7.U2.T2;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class interseccion {
    static Set interseccion (Set conjunto1, Set conjunto2){
        Set interseccion=new HashSet();
        for (Iterator it= conjunto1.iterator();it.hasNext();){
            Object temp=it.next();
            if (conjunto2.contains(temp)){
                interseccion.add(temp);
            }
        }
        return interseccion;
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
        System.out.println("Conjunto de interseccion:\n"+interseccion(s1,s2));;
    }
}
