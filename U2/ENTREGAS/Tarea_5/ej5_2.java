package Tarea5;

import java.util.Scanner;

public class ej5_2 {
    public static void main(String[] args) {
        System.out.println("Introduce el número 12");
        Scanner teclado = new Scanner(System.in);
        int num1=teclado.nextInt();
        if (num1==12){
            System.out.println("Correcto");
        }
        else{
            System.out.println("Error");
        }
    }
}
