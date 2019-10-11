package Tarea8;

import java.util.Scanner;

public class ej8_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1=teclado.nextInt();
        int aux=1;

        for (int i=num1;i>0;i--){
            aux=aux*i;
            }
        System.out.println(aux);
        }
    }

