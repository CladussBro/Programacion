package U2.EXAMEN;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        long num=teclado.nextLong();

        for (long i = num; i <num+5; i++) {
            System.out.print(i + " ");
        }
    }
}

