package Adicionales;

import java.util.Scanner;

public class ad_9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce la altura del palo: ");
        int alt=teclado.nextInt();

        for(int i=0;i<alt-1;i++){
            System.out.println("*");
        }
        for(int k=0;k<(alt/2)+1;k++){
            System.out.print("*  ");
        }
    }
}
