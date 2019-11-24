package U3_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] tabla = new int[6];
        int[] tabla2 = new int[6];
        int[] tabla3 = new int[tabla.length+tabla2.length];

        System.out.println("Introduce 6 valores para la siguiente tabla");
        for (int i = 0; i < tabla.length ; i++) {
            System.out.print(i+1 + ". ");
            tabla[i]=teclado.nextInt();
        }
        System.out.println("Introduce 6 valores para la siguiente tabla");
        for (int i = 0; i < tabla2.length ; i++) {
            System.out.print(i+1 + ". ");
            tabla2[i]=teclado.nextInt();
        }
        Arrays.sort(tabla);
        Arrays.sort(tabla2);
        System.out.println("Tabla 1: " + Arrays.toString(tabla));
        System.out.println("Tabla 2: " + Arrays.toString(tabla2));

        int j=0;
        for (int i = 0; i <tabla.length ; i++) {
            tabla3[j]=tabla[i];
            j++;
            tabla3[j]=tabla2[i];
            j++;
        }
        Arrays.sort(tabla3);
        System.out.println("Tabla Mezclada: " + Arrays.toString(tabla3));
        System.out.println();
    }
    }

