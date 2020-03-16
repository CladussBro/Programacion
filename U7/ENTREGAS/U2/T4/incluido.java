package U7.U2.T4;

import java.util.HashSet;
import java.util.Set;

public class incluido {
    static boolean incluido(Set conj1, Set conj2){
        return conj2.containsAll(conj1);
    }

    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for (int i = 1; i <= 6 ; i++) {
            s1.add(i);
        }
        for (int i = 1; i <= 4; i++) {
            s2.add(i);
        }
        System.out.println("Conjunto 1:"+s1);
        System.out.println("Conjunto 2:"+s2);
        System.out.println("Conjunto 1 en 2:"+incluido(s1,s2));
        System.out.println("Conjunto 2 en 1"+incluido(s2,s1));
    }
}
