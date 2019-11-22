package U3_T1;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
        System.out.print("Primo: "+primos(num));
    }
    public static boolean primos(int num) {

        for (int i = 2; i < num; i++) {
            if ((num % i) == 0) {
                return false;
            }
        }
        return true;
    }
}


