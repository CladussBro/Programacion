package U7.U1.T4;

import java.util.*;

public class frase {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una frase: ");
        String frase=teclado.nextLine();
        String palabras[]=frase.split(" ");
        List<String> listaPalabras= new ArrayList<>();

        for (String p:palabras) {
            listaPalabras.add(p);
        }

        Set<String> palabrasrepe=new LinkedHashSet<>();
        List<String> aux=new ArrayList<>(listaPalabras);

        while(aux.size()>0){
            String temp=aux.remove(0);
            if (aux.contains(temp)){
                palabrasrepe.add(temp);
            }
        }
        System.out.println("Estas son las palabras repetidas: \n"+palabrasrepe);
        aux=new ArrayList<>(listaPalabras);
        aux.removeAll(palabrasrepe);
        System.out.println("Estas son las palabras sin repetir: \n"+aux);
    }
}
