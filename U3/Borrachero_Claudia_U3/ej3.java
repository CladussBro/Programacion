package RECUP;

import java.util.Scanner;

public class ej3 {
    public static void main (String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] x = new int[6][6];

        for (int i = 0; i < 6; i++)
            for (int j = 0; j < 6; j++) {
                x [i] [j] = (int) (Math.random()*100);
            }

        public static boolean esPuntoDeSilla (int x[][], int i, int j){
            for (i = 0; i < 6; i++) {
                x[i][5] = x[i][0];
                for (j = 0; j < 6; j++)
                    if (x[i][j] > x[5][i])
                        x[5][i] = x[i][j];
            }
            for (i = 0; i < 6; i++)
                for (j = 0; j < 6; j++) {
                    if (x[i][5] == x[5][j])
                        System.out.println("El punto de silla es: " + x[i][5]);
                }
        }
    }
}
