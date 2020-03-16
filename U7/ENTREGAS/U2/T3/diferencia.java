package U7.U2.T3;

import java.util.HashSet;
import java.util.Set;

public class diferencia {
    static Set diferencia(Set conj1,Set conj2){
        Set resultado = new HashSet(conj1);
        resultado.removeAll(conj2);
        return resultado;
    }

    public static void main(String[] args) {
        Set<Integer> s1=new HashSet<>();
        Set<Integer> s2=new HashSet<>();
        for (int i = 1; i <= 6 ; i++) {
            s1.add(i);
        }
        for (int i = 6; i <= 10; i++) {
            s2.add(i);
        }
        System.out.println("Conjunto 1:"+s1);
        System.out.println("Conjunto 2:"+s2);
        System.out.println("Diferencia:"+diferencia(s1,s2));
    }
}
