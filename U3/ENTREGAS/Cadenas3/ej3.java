package U3_Cadenas;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        String sinVocales="";
        char c;
        System.out.println("Introduce su nombre: ");
        String nombre = teclado.nextLine();

        for (int i = 0; i < nombre.length(); i++) {
            c=nombre.charAt(i);

            if (!esVocal(c)) {
                sinVocales = sinVocales + c;
            }
        }
        System.out.println(sinVocales);
    }
    static boolean esVocal(char c) {
        String vocales="aeiouáéíóú";
        c=Character.toLowerCase(c);
        if (vocales.indexOf(c)==-1)  {
            return false;
        } else {
            return true;
        }
    }
}
