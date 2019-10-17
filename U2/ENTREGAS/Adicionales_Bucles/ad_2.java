package Adicionales;

import java.util.Scanner;

public class ad_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número");
        int num1=teclado.nextInt();
        int aux=num1-1;

        for(int i=0;i<5;i++){
            aux=aux+1;
            System.out.print(aux);
            for(int x=0;x<10;x++){
                System.out.print(" ");
            }
            for(int p=0;p<1;p++){
                System.out.print(Math.pow(aux, 2));
            }
            for(int x=0;x<10;x++){
                System.out.print(" ");
            }
            for(int l=0;l<1;l++) {
                System.out.println(Math.pow(aux, 3));
            }
        }
    }
}
