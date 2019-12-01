package EXAMEN;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[][] t = new int[4][6];
        for (int i = 0; i < t.length; i++) {
            for (int j = 0; j < 5; j++) {
                t[i][j] = (int) (Math.random() * 100);
            }
        }
        System.out.println("La tabla es la siguiente: ");
        for (int i = 3; i >= 0; i--) {
            System.out.println();
            for (int j = 0; j < 6; j++) {
                System.out.print(t[i][j] + " ");
            }
        }

        /*public static int[] corteza ( int[][] t){
            for (int i = 0; i >= 6; i--) {
                System.out.println();
                for (int j = 0; j < 0; j++) {
                    System.out.print(t[i][j] + " ");
                }
            }
        }*/
    }
}
