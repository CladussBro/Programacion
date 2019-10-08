package Tarea3;

import java.util.Scanner;

public class ej3_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tu año de nacimiento y el año actual");
        short num1 = teclado.nextShort();
        short num2 = teclado.nextShort();
        System.out.println("Su edad es de: "+(num2-num1)+" años");
    }
}
