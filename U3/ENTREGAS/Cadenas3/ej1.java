package U3_Cadenas;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String frase = "";
        System.out.println("Escribe una palabra: ");
        String palabra = teclado.nextLine();

        while (!palabra.toLowerCase().equals("fin")) {
            frase = frase + " " + palabra;
            System.out.println("Escribe una palabra: ");
            palabra=teclado.nextLine();
        }
        System.out.println(frase);
    }
}
