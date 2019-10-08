package Tarea5;

import java.util.Scanner;

public class ej5_1 {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        int num1=teclado.nextInt();

        if (num1>0) {
            System.out.println("Es positivo");
        }
            else if (num1<0) {
                System.out.println("Es negativo");
            }
                else {
                System.out.println("Igual a 0");
            }
        }
    }

