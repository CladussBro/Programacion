package Adicionales;

import java.util.Scanner;

public class ad_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la combinación de 4 cifras de la caja fuerte");
        short clave=teclado.nextShort();
        short combi=2604;
        short contador=1;

        while(clave!=combi && contador<=3){
            System.out.println("Lo siento, esa no es la combinación");
            clave=teclado.nextShort();
            contador++;
        }
        if(contador==4){
            System.out.println("No quedan intentos");
        }
        if(clave==combi){
            System.out.println("La caja fuerte se ha abierto satisfactoriamente");
        }
    }
}
