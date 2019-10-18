package Tarea9;

import java.util.Scanner;

public class ej9_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Jugador 1: Introduce la contraseña: ");
        String j1 = teclado.next();
        System.out.println("Jugador 2: Juguemos, intenta adivinar la contraseña");
        int contra = j1.length();
        System.out.println("Pista 1: El número de carácteres es de: " + contra);
        System.out.println("Pista 2: El primer carácter es " + j1.charAt(0) + " y el último es " + j1.charAt(contra - 1));
        String j2;
        do {
            System.out.print("Introduce tu respuesta:");
            j2 = teclado.next();
            int comp = j1.compareTo(j2);
            if (comp == 0) {
                System.out.println("Acertaste");
            } else if (comp < 0) {
                System.out.println("La contraseña es menor que " + j2);
            } else {
                System.out.println("La contraseña es mayor que " + j2);
            }
        }while (!j1.equals(j2));

    }
    }

