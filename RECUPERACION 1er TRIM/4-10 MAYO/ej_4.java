package RECUP;

import java.util.Scanner;

public class ej_4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura de la figura: ");
        int alt=teclado.nextInt();
        while ((alt<3)||(alt%2==0)){
            System.out.print("Error");
            alt=teclado.nextInt();
        }
        for (int fil=1;fil<=alt;fil++){
            for (int col=1;col<=alt;col++){
                if ((fil==col) || (col==(alt-fil)+1)){
                    System.out.print("*");
                } else {
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
    }
}
