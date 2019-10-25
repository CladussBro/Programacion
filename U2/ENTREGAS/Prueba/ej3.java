package Prueba;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        int num=teclado.nextInt();
        teclado.nextLine();
        String binario = "";

        if (num > 0) {
            while (num > 0) {
                if (num % 2 == 0) {
                    binario = "0" + binario;
                } else {
                    binario = "1" + binario;
                }
                num = (int) num / 2;
            }
        } else if (num == 0) {
            binario = "0";
        } else {
            binario = "No se pudo convertir el numero. Ingrese solo números positivos";
        }
        System.out.println("El número convertido a binario es: " + binario);
    }
}
