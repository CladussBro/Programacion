package RECUP;

import java.util.Scanner;

public class ej_19 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce el número de filas: ");
        int filas=teclado.nextInt();
        System.out.print("Introduce el número de columnas: ");
        int columnas=teclado.nextInt();
        System.out.println("Introduce la posición del número que desea ver: ");
        int posicion=teclado.nextInt();

        int [] [] matriz = new int[filas][columnas];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                matriz [i] [j] = (int) (Math.random()*1000)+1;
            }
        }

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz.length; j++) {
                System.out.printf("%4d   ", matriz[i][j]);
            }
            System.out.println();
        }

        System.out.println("El número es: ");
        System.out.println(nEsimo(matriz,posicion));
    }


    public static int nEsimo(int[][] matriz, int posicion){
        int aux=0;
        for (int i = 0; i < posicion; i++) {
            for (int j = 0; j < posicion; j++) {
                if (matriz[i] [j] > aux) {
                    aux = matriz[i] [j];
                }
            }
        }
        return aux;
    }
}
