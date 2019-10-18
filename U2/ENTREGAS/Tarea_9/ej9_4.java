package Tarea9;

import java.util.Scanner;

public class ej9_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String frase=teclado.nextLine();

        int mitad=frase.length()/2;
        String espacio=frase.substring(mitad, mitad+1);
        String espacio2=" ";

        if (espacio.equals(espacio2)) {
            System.out.println("Es un espacio");
        } else {
            System.out.println("No es un espacio");
        }

    }
}
