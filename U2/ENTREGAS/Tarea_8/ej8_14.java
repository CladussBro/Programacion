package Tarea8;

import java.util.Scanner;

public class ej8_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1=teclado.nextInt();

        for(int i=1;i<=num1;i++){
            for(int x=i;x<=num1;x++){
                System.out.print("* ");
            }
            System.out.println("");
        }
    }
}
