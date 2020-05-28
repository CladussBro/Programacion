package U2.EXAMEN;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduzca una frase");
        String cadena = teclado.nextLine();

        char vocal1 ='a';
        char vocal2= 'e';
        char vocal3= 'o';
        char hache='h';
        char espacio=' ';
        int contador=0;

        for (int i=0; i<cadena.length();i++){
            char lugar=cadena.charAt(i);
            if (lugar == vocal1 || lugar == vocal2 || lugar == vocal3 || lugar == hache || lugar == espacio) {
                contador++;
            }
        }
        System.out.println("La cantidad de espacios, haches y vocales es de: "+contador);
    }
}
