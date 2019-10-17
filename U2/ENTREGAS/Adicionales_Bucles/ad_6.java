package Adicionales;

import java.util.Scanner;

public class ad_6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero de filas que tendrá la pirámide: ");
        int alt=teclado.nextInt();
        System.out.print("Introduce el carácter con el que construir la pirámide: ");
        String dentro=teclado.next();
        int altura=1;
        int i=0;
        int esp1=alt-1;
        int esp2=0;

        while (altura<alt) {
            for (i=1;i<=esp1;i++) {
                System.out.print(" ");
            }
            System.out.print(dentro);
            for (i=1;i<esp2;i++) {
                System.out.print(" ");
            }
            if (altura>1) {
                System.out.print(dentro);
            }
            System.out.println();
            altura++;
            esp1--;
            esp2+= 2;
        }
        for (i=1;i<altura*2;i++) {
            System.out.print(dentro);
        }
    }
}
