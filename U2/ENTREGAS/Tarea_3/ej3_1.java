package U2.Tarea_3;

import java.util.Scanner;

public class ej3_1 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números de dos cifras");
        byte num1 = teclado.nextByte();
        byte num2 = teclado.nextByte();
        System.out.println("La suma de los números es: "+(num1+num2));
    }
}
