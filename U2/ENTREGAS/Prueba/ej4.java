package Prueba;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int max=0;
        do {
            System.out.print("Introduce la altura de la figura: ");
            max=teclado.nextInt();
        } while (max%2==0 || max<3);

        String espacios="     ";

        for(int i=1;i<=max;i=i+2) {
            for(int k=max+1;k>=i;k=k-2) {
                System.out.print(" ");
            }
            for(int j=0;j<1;j++) {
                System.out.print("*" + espacios + "*");
            }
            System.out.println();
        }
        for(int i=max;i>1;i=i-2) {
            for(int k=i;k<=max+2;k=k+2) {
                System.out.print(" ");
            }
            for(int j=1;j>0;j--)
            {
                System.out.print("*" + espacios + "*");
            }
            System.out.println();
        }
    }
}
