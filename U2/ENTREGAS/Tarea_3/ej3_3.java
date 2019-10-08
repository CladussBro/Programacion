package Tarea3;

import java.util.Scanner;

public class ej3_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        System.out.println("La división de los números da: "+(num1/num2));
    }
}
