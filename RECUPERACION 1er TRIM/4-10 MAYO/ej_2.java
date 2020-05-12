package RECUP;

import java.util.Scanner;

public class ej_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Por favor, introduzca un número entero positivo: ");
        long numUs = teclado.nextLong();
        System.out.print("Dígitos pares: ");
        int div = 10;
        long numBasura = numUs;
        long reves = 0;
        int numDig = 0;
        while (numBasura > 0){
            reves = ((reves*10) + (numBasura % 10));
            numBasura /=10;
            numDig++;
        }
        long dig;
        long suma = 0;
        for (int i = 0; i < numDig ; i++){
            dig = reves%10;
            if (dig%2 == 0){
                System.out.print(dig+" ");
                suma += dig;
            }
            reves /= 10;
        }
        System.out.print("Suma de los dígitos pares: "+suma);
    }
}
