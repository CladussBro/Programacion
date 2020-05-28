package U2.Tarea_6;

import java.util.Scanner;

public class ej6_5 {
    public static void main(String[] args) {
        System.out.println("Introduce el radio");
        Scanner teclado = new Scanner(System.in);
        float radio = teclado.nextFloat();

        System.out.println("Por favor, elige una opcion: ");
        System.out.println("1.Calcular diámetro");
        System.out.println("2.Calcular perímetro");
        System.out.println("3.Calcular área");
        int elige = teclado.nextInt();

        switch (elige) {
            case 1:
                System.out.println("El diámetro es de "+(2*radio));
                break;
            case 2:
                System.out.println("El perímetro es de "+(2*Math.PI*radio));
                break;
            case 3:
                System.out.println("El área es de "+(Math.PI*radio*radio));
                break;
            default:
                System.out.println("Error");
        }
    }
}
