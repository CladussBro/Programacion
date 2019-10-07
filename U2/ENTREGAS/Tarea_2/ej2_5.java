package Tarea2;

import java.util.Scanner;

public class ej2_5 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una temperatura en °C");
        int num1=teclado.nextInt();
        System.out.println(num1+"°C en °F son: "+(num1*(9/5)+32)+"°F");
    }
}
