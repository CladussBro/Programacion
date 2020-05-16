package RECUP;

import java.util.Scanner;

public class ej_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduzca número de filas que tendrá la pirámide: ");
        int filas=teclado.nextInt();
        System.out.print("Introduce el número con el que quiere construir la pirámide: ");
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
