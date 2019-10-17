package Adicionales;

import java.util.Scanner;

public class ad_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num=teclado.nextInt();
        int i;

        for (i=0;num>0;num/=10,i*=10){
            i+=num%10;
        }
        System.out.println(i/10);

    }
}
