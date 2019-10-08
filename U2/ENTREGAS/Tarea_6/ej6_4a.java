package Tarea6;

import java.util.Scanner;

public class ej6_4a {
    public static void main(String[] args) {
        System.out.println("Introduce dos números");
        Scanner teclado = new Scanner(System.in);
        byte num1 = teclado.nextByte();
        byte num2 = teclado.nextByte();
        if (num1>num2){
            byte menor=num2;
            System.out.println("El valor de la variable llamada menor es "+menor);
        }
        else{
            byte menor=num1;
            System.out.println("El valor de la variable llamada menor es "+menor);
        }
    }
}
