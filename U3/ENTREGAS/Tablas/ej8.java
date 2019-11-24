package U3_Tablas;

import java.util.Scanner;

public class ej8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [][] t = new int[6][6];
        for (int i=0;i<t.length;i++) {
            for (int j=0;j<5;j++) {
                t[i][j]=i+j;
            }
        }
        System.out.println("La tabla es la siguiente: ");
        for (int i=5;i>=0;i--) {
            System.out.println();
            for (int j=0;j<6;j++) {
                System.out.print(t[i][j]+" ");
            }
        }
    }
}
