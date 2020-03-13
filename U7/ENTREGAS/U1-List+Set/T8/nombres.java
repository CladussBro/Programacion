package U7.U1.T8;

import java.util.*;

public class nombres {

    static List eliminarrepe(List c){
        Set temp=new LinkedHashSet(c);
        return new ArrayList(temp);
    }

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        List<String> lista = new ArrayList<>();
        System.out.println("Introduce una palabra (\"fin\" para terminar): ");
        String nombre=teclado.nextLine();
        while(!nombre.equalsIgnoreCase("fin")){
            lista.add(nombre);
            System.out.println("Introduce un nombre:");
            nombre=teclado.nextLine();
        }
        System.out.println("Lista con repetidos:\n"+lista);
        System.out.println("Lista sin repetidos:");
        lista=eliminarrepe(lista);
        System.out.println(lista);
    }
}