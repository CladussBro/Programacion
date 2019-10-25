package Prueba;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        long num=teclado.nextLong();
        boolean capi = false;

        long numBasura = num;
        long numDig = 0;
        long numR = 0;
        while (numBasura > 0){
            numR = ((numR*10) + (numBasura % 10));
            numBasura /=10;
            numDig++;
        }
        // Los compara
        long numD = num;
        long cifraDerecho = 0;
        long cifraReves = 0;
        numDig /= 2;
        do{
            cifraDerecho = numD%10;
            cifraReves = numR%10;
            if (cifraDerecho == cifraReves){
                capi = true;
            } else {
                capi = false;
            }
            numD /= 10;
            numR /= 10;
            numDig--;
        } while ((numDig > 0) && (capi == true));
        System.out.print("El número "+num);
        if (capi == true){
            System.out.print(" es capicúa");
        } else {
            System.out.print(" no es capicúa");
        }
    }
}
