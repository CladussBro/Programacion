package U3_Tablas;

import java.util.Arrays;
import java.util.Scanner;

public class ej6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[6];
        int[] num1 = new int[num.length];

        System.out.println("Introduce 6 valores para la siguiente num");
        for (int i = 0; i < num.length ; i++) {
            System.out.print(i+1 + ". ");
            num[i]=teclado.nextInt();
        }
        Arrays.sort(num);
        System.out.println("Tabla 1: " + Arrays.toString(num));
        sinRepetidos(num);
        System.out.println("Tabla sin Repetidos: " + Arrays.toString(eliminarCeros(num)));
        System.out.println();
    }
    static int[] sinRepetidos(int t[]) {
        int eliminar=0;
        for (int i = 0; i < t.length-1; i++) {
            if (t[i] == t[i + 1]) {
                t[i + 1] = eliminar;
                eliminarNum(t, eliminar);
            }
        }
        return t;
    }
    static int [] eliminarNum(int t[], int posicionEliminar) {
        for (int i = 0; i < t.length; i++) {
            if (posicionEliminar==t[i]) {
                t[i]=0;
            }
        }
        Arrays.sort(t);
        return t;
    }
    static int[] eliminarCeros(int t[]) {
        int contador=0;
        for (int i = 0; i < t.length; i++) {
            if (t[i]==0) {
                contador++;
            }
        }
        return Arrays.copyOfRange(t, contador, t.length);
    }



}
