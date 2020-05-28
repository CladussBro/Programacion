package U2.Tarea_8;

import java.util.Scanner;

public class ej8_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int altura, aux = 0;
        do {
            System.out.println("Introduce la altura del árbol");
            altura = teclado.nextInt();
            if (altura > aux) {
                aux = altura;
            }
        }
        while (altura!=-1);
            System.out.println("El árbol más alto tiene una altura de "+aux);
        }
    }

