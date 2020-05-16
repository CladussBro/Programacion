package RECUP;

import java.util.Scanner;

public class ej_10 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce la altura de la pecera, como mínimo 4: ");
        int a=teclado.nextInt();
        System.out.print("Introduce el ancho de la pecera, como mínimo 4: ");
        int b=teclado.nextInt();
        int c=(int)((Math.random()*(b-1))+1);
        System.out.println(c);
        int d=(int)((Math.random()*(a-1))+1);
        System.out.println(d);
        for (int i = 0; i < a; i++) {
            for (int j = 0; j < b; j++) {
                if ((j==0)||(j==b-1)||(i==0)||(i==a-1)){
                    System.out.print("* ");
                }else if((j==c)&&(i==d)){
                    System.out.print("&");
                }else{
                    System.out.print("  ");
                }
            }
            System.out.println(" ");
        }
    }
}
