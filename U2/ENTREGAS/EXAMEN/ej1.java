package U2.EXAMEN;

import java.util.Scanner;

public class ej1 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int n = teclado.nextInt();
        if (n >= 3) {
            for (int i = 0; i < n; ++i) {
                System.out.println();
                for (int j = 0; j < n - i - 1; ++j) {
                    System.out.print(" ");
                }
                for (int j = 0; j < 2 * i + 1; ++j) {
                    if ((i == 0) || (j == 0) || (j == 2 * i)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            for (int j = n - 2; j >= 0; --j) {
                System.out.println();
                for (int i = 0; i < n - j - 1; ++i) {
                    System.out.print(" ");
                }
                for (int i = 0; i < 2 * j + 1; ++i) {
                    if ((j == 0) || (i == 0) || (i == 2 * j)) {
                        System.out.print("*");
                    } else {
                        System.out.print(" ");
                    }
                }
            }
            System.out.println();
        }
    }
}

