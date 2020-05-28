package U2.Tarea_9;

import java.util.Scanner;

public class ej9_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos palabras");
        String p1=teclado.next();
        String p2=teclado.next();

        if(p1.length()<p2.length()){
            System.out.print("La palabra "+p1+" es más corta que "+p2);
        }
        else{
            System.out.print("La palabra "+p2+" es más corta que "+p1);
        }
    }
}
