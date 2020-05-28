package U2.EXAMEN;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        String num=teclado.nextLine();
        System.out.print("Introduce la posición donde quiere insertar: ");
        int num1=teclado.nextInt();
        System.out.print("Introduce el dígito que desea insertar: ");
        int num2=teclado.nextInt();

        for (int i=1; i<num.length();i++){
            for (int j=1; j<num1;j++){
            System.out.print(i+""+num2);
            }
        }
    }
}
