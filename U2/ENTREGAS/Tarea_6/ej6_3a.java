package Tarea6;

import java.util.Scanner;

public class ej6_3a {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        if (num1%2==0){
            System.out.println("1");
        }
        else{
            System.out.println("0");
        }
    }
}
