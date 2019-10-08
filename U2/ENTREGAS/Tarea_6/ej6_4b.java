package Tarea6;

import java.util.Scanner;

public class ej6_4b {
    public static void main(String[] args) {
        System.out.println("Introduce dos números");
        Scanner teclado = new Scanner(System.in);
        byte num1 = teclado.nextByte();
        byte num2 = teclado.nextByte();
        byte menor=(num1>num2)?num2:num1;
        System.out.println(menor);
    }
}
