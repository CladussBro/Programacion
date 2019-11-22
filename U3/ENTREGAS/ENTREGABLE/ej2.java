package PRUEBA3;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] num = new int[4][5];
        int fila,columna,sumFila,sumColumna;
        int sumaTotal = 0;

        System.out.println("Introduce 20 números enteros");
        for(fila = 0; fila < 4; fila++) {
            for(columna = 0; columna < 5; columna++) {
                System.out.print("Fila " + fila + ", columna " + columna + ": ");
                num[fila][columna] =teclado.nextInt();
            }
        }
        for(fila = 0; fila < 4; fila++) {
            sumFila = 0;
            for(columna = 0; columna < 5; columna++) {
                System.out.printf("%7d   ", num[fila][columna]);
                sumFila += num[fila][columna];
            }
            System.out.printf("|%7d\n", sumFila);
        }
        for(columna = 0; columna < 5; columna++) {
            System.out.print("----------");
        }
        System.out.println("-----------");

        for(columna = 0; columna < 5; columna++) {
            sumColumna = 0;
            for(fila = 0; fila < 4; fila++) {
                sumColumna += num[fila][columna];
            }
            sumaTotal += sumColumna;
            System.out.printf("%7d   ", sumColumna);
        }
        System.out.printf("|%7d   ", sumaTotal);
    }
}
