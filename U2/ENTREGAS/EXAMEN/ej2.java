package U2.EXAMEN;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce un número entero positivo: ");
        long num=teclado.nextLong();

        for (int i=0; i<num;i++){
            if (num%2==0) {
                System.out.print("El número introducido tiene "+i+" números pares");

            }else if (num%2==1){
                System.out.print("El número introducido tiene "+i+" números impares");

            }
        }
    }
}
