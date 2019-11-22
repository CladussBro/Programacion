package U3_T1;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce tres números enteros:");
        int num1=teclado.nextInt();
        int num2=teclado.nextInt();

        int mayor1=nums(num1,num2);
        int num3=teclado.nextInt();
        System.out.println("El mayor es: "+nums(mayor1,num3));
    }

    public static int nums(int num1, int num2){
        int nums=0;
        if (num1>num2){
            nums=num1;
        }else if(num1<num2){
            nums=num2;
        }
            return nums;
    }
}
