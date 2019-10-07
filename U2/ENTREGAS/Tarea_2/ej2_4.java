package Tarea2;

import java.util.Scanner;

public class ej2_4 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una longitud en millas");
        int num1=teclado.nextInt();
        System.out.println(num1+" millas en metros son: "+num1*1609+" m");
    }
}
