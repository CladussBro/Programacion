package U2.Tarea_4;

import java.util.Scanner;

public class ej4_4 {
    public static void main(String[] args) {
        System.out.println("Introduce un número decimal");
        Scanner teclado = new Scanner(System.in);
        float num1=teclado.nextFloat();
        System.out.println("El número redondeado es "+Math.round(num1));
    }
}
