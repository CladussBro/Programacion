package Tarea8;

import java.util.Scanner;

public class ej8_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un valor máximo y un valor mínimo");
        int max=teclado.nextInt();
        int min=teclado.nextInt();
        System.out.println("Introduce un valor");
        int num1=teclado.nextInt();
        while(!(num1>min && num1<max)){
            System.out.println("Introduce un valor");
            num1=teclado.nextInt();
        }
        System.out.println("Gracias");
    }
}
