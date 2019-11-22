package U3_T1;

import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un carácter:");
        String caracter=teclado.nextLine();

        if (comprobarVocal(caracter)==true) {
            System.out.print("Es vocal");
        } else {
            System.out.print("No es vocal");
        }
    }
    public static boolean comprobarVocal(String frase){
        boolean booleano=false;

        if (frase.equalsIgnoreCase("a") || frase.equalsIgnoreCase("e")
                || frase.equalsIgnoreCase("i") || frase.equalsIgnoreCase("o")
                || frase.equalsIgnoreCase("u")) {
            booleano=true;
        }
        return booleano;
    }
    }

