package U2.Tarea_8;

import java.util.Scanner;

public class ej8_15 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        short contadorPrimos=0;
        System.out.println("Introduce un número");
        int num1=teclado.nextInt();
        for (int i=1; i<(num1+1);i++){
            if ((i%2!=0 && i!=1)||(i==2)){
                contadorPrimos++;
            }
        }
        System.out.println("Entre 1 y "+num1+" hay "+contadorPrimos+" números primos");
    }
}
