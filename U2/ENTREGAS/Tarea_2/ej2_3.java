package U2.Tarea_2;

import java.util.Scanner;

public class ej2_3 {

    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1=teclado.nextInt();
        System.out.println("Introduce otro número");
        int num2=teclado.nextInt();
        System.out.println("El resultado de la división entre "+num1+"/"+num2+" es de:"+(num1/num2));
    }
}
