package U2.Tarea_5;

import java.util.Scanner;

public class ej5_4 {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();
        if ((num1%2==0) && (num2%2==0)){
            System.out.println("Ambos son pares");
        }
        else if ((num1%2==0) && (num2%2==1)){
            System.out.println("Hay un número par");
        }
        else{
            System.out.println("Ambos son impares");
        }
    }
}
