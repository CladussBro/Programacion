package U7.U2.T6;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class leecadena {
    static List<Character> leecadena(){
        Scanner teclado=new Scanner(System.in);
        List<Character>resultado=new ArrayList<>();
        System.out.println("Introduce una frase: ");
        String cadena=teclado.nextLine();
        for (int i = 0; i < cadena.length(); i++) {
            resultado.add(cadena.charAt(i));
        }
        return resultado;
    }

    public static void main(String[] args) {
        List<Character>lista=leecadena();
        System.out.println("Lista: "+lista);
    }
}
