package Tarea4;

import java.util.Scanner;

public class ej4_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres notas con sus decimales");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        double num3 = teclado.nextDouble();

        int media= (int) ((num1+num2+num3)/3);
        System.out.println("La media de las notas es: "+media);
    }
}
