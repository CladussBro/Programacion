package RECUP;

import java.util.Scanner;

public class ej_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [][] t = new int[10][10];
        for (int i=0;i<t.length;i++) {
            for (int j=0;j<9;j++) {
                t[i][j]=(int)(Math.random()*(300-200+1))+200;
            }
        }
        System.out.println("La tabla es la siguiente: ");
        for (int i=9;i>=0;i--) {
            System.out.println();
            for (int j=0;j<10;j++) {
                System.out.print(t[i][j]+" ");
            }
        }
    }
}
