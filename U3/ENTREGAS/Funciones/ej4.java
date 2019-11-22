package U3_T1;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números enteros:");
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();
        teclado.nextLine();
        System.out.println("El mayor es: "+nums(num1,num2));
        teclado.close();
    }

    public static int nums(int num1, int num2){
        if (num1<num2){
            return num2;
        }else{
            return num1;
        }
    }
}
