package U3_T1;

import java.util.Scanner;

public class ej11 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        float a = teclado.nextFloat();
        int n = teclado.nextInt();
        System.out.println("Iterativa: "+iterativa(a, n));
        System.out.println("Recursiva: "+recursividad(a,n));
    }
    static float recursividad(float a, int n) {
        if (n <= 1) {
            return a;
        } else {
            return a * recursividad(a, (n - 1));
        }
    }
    static float iterativa(float a, int n) {
        float result=1;
        for (int i=1;i<=n;i++){
            result=(result*a);
        }
        return result;
    }
}

