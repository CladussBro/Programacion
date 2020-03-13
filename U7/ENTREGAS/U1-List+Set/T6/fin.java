package U7.U1.T6;

import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;

public class fin {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Set<String> nombres= new LinkedHashSet<>();

        System.out.println("Introduce una palabra (\"fin\" para terminar): ");
        String temp=teclado.nextLine();
        while(!temp.equalsIgnoreCase("fin")){
            nombres.add(temp);
            System.out.println("Introduce un nombre: ");
            temp=teclado.nextLine();
        }
        System.out.println("Nombres sin repetidos: \n" +nombres);
    }
}
