package Adicionales;

import java.util.Scanner;

public class ad_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca numero de filas que tendrá la pirámide: ");
        int filas=teclado.nextInt();
        System.out.print("Introduce el carácter con el que construir la pirámide: ");
        String caracter=teclado.next();

        for(int alt=1;alt<=filas;alt++){
            for(int i=1;i<=filas-alt;i++){
                System.out.print(" ");
            }
            for(int s=1;s<=(alt*2)-1;s++){
                System.out.print(caracter);
            }
            System.out.println();
        }

    }
}
