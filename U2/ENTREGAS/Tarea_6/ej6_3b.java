package U2.Tarea_6;

import java.util.Scanner;

public class ej6_3b {
    public static void main(String[] args) {
        System.out.println("Introduce un número");
        Scanner teclado = new Scanner(System.in);
        int num1 = teclado.nextInt();
        int resultado=(num1%2==0)?1:0;
        System.out.println(resultado);
    }
}
