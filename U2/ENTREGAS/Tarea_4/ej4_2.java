package U2.Tarea_4;

import java.util.Scanner;

public class ej4_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos notas");
        double num1 = teclado.nextDouble();
        double num2 = teclado.nextDouble();
        System.out.println("La media de las notas es: "+((num1+num2)/2));
    }
}
