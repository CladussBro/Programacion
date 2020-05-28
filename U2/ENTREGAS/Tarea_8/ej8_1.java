package U2.Tarea_8;

import java.util.Scanner;

public class ej8_1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        double num1=teclado.nextInt();

        while (num1!=0){
            if (num1%2==0) {
                System.out.println("Es par");
            }
            if (num1>0){
                System.out.println("Es positivo");
            }

            System.out.println("Su cuadrado es:"+(Math.pow(num1,2)));

            System.out.println("Introduce un número");
            num1=teclado.nextInt();
        }
        System.out.println("Ha introducido un 0, ERROR");
    }
}
