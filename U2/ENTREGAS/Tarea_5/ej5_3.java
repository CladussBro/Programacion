package Tarea5;

import java.util.Scanner;

public class ej5_3 {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        int num1=teclado.nextInt();
        if (num1%2==0){
            System.out.println("Es par");
        }
        else if (num1%2==1){
            System.out.println("Es impar");
        }
        else{
            System.out.println("No debes introducir números negativos");
        }
        }
}
