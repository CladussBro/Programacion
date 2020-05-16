package RECUP;

import java.util.Scanner;

public class ej_6 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Por favor, introduzca un número entero positivo: ");
        int num=teclado.nextInt();
        System.out.println("Introduzca la posición dentro del número: ");
        int posicion=teclado.nextInt();
        System.out.println("Introduce el nuevo número: ");
        int nuevo=teclado.nextInt();

        int num1=num;
        int longi=0;
        int alreves=0;

        while(num1>0){
            alreves=(alreves*10)+(num1%10);
            num1/=10;
            longi++;
        }
        int num2=0;
        for (int i = 0; i < posicion; i++) {
            num2=((num2*10)+(alreves%10));
            alreves/=10;
        }
        num2=((num2*10)+nuevo);
        alreves/=10;
        while(posicion<longi){
            num2=((num2*10)+(alreves%10));
            alreves/=10;
            posicion++;
        }
        System.out.println("El número resultante es: "+num2);
    }
}
