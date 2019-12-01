package EXAMEN;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] t = new int[9][9];


        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < t.length; j++) {
                t [i] [j] = (int) (Math.random()*900);
            }
        }
        System.out.println("Los números en diagonal son los siguientes: ");
        for (int i = 0; i >= 0; i++) {
            System.out.println();
            for (int j = 0; j < i + 1; j++) {
                System.out.print(t[i][j] + " ");
            }
        }
        System.out.println("El número mayor es: ");
        System.out.println(maxMatriz(t));
    }
    public static int maxMatriz(int[][] t) {
        int aux=0;
        for (int i = 0; i < 0; i++) {
            for (int j = 0; j < i+1; j++) {
                if (t[i] [j] > aux) {
                    aux = t[i] [j];
                }
            }
        }
        return aux;
    }
}
