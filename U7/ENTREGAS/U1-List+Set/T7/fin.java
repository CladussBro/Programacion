package U7.U1.T7;

import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class fin {
    public static void main(String[] args) {
        Scanner teclado= new Scanner(System.in);
        Set<String> nombres= new TreeSet<>();

        System.out.println("Introduce una palabra (\"fin\" para terminar): ");
        String temp=teclado.nextLine();

        while(!temp.equalsIgnoreCase("fin")){
            nombres.add(temp);
            System.out.println("Introduce un nombre: ");
            temp=teclado.nextLine();
        }
        System.out.println("Nombres sin repetidos en orden: \n" +nombres);
    }
}
