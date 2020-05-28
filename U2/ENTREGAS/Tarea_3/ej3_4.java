package U2.Tarea_3;

import java.util.Scanner;

public class ej3_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce una longitud en millas");
        double num1=teclado.nextDouble();
        System.out.println(num1+" millas en KM son: "+num1*1.609+"KM");
    }
}
