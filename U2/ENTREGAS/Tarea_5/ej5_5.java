package Tarea5;

import java.util.Scanner;

public class ej5_5 {
    public static void main(String[] args) {
        System.out.println("Introduce tres números");
        Scanner teclado = new Scanner(System.in);
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();
        int num3=teclado.nextInt();
        if (num1>num2 && num1>num3){
            System.out.println("El mayor es "+num1);
        }
        else if (num2>num1 && num2>num3){
            System.out.println("El mayor es "+num2);
        }
        else{
            System.out.println("El mayor es "+num3);
        }
    }
}
