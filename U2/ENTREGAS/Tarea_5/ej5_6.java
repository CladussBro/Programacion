package Tarea5;

import java.util.Scanner;

public class ej5_6 {
    public static void main(String[] args) {
        System.out.println("Introduce el valor de tiempo");
        Scanner teclado = new Scanner(System.in);
        int num1=teclado.nextInt();
        final double gravedad=9.8;
        double velocidad=gravedad*num1;
        if (num1<=0){
            System.out.println("Tiempo incorrecto");
        }
        else {
            System.out.println("La velocidad es de "+velocidad);
        }
    }
}

