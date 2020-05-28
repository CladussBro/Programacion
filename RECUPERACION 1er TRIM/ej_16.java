package RECUP;

import java.util.Scanner;

public class ej_16 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce la altura del triángulo: ");
        int altura=teclado.nextInt();

        for (int fila = 1; fila <=altura ; fila++) {
            System.out.println("");
            for (int col = 1; col <= fila; col++) {
                if ((col == 1) || (fila == col) || (fila == altura)) {
                    System.out.print("* ");
                }else {
                    System.out.print("  ");
                }
            }
        }
        System.out.println( );
    }
}
