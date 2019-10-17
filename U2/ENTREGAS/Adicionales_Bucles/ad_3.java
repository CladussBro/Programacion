package Adicionales;

import java.util.Scanner;

public class ad_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce la cantidad de números que aparezcan");
        int num1 = teclado.nextInt();
        int fibo1=0;
        int fibo2=1;
        int aux=0;

        for (int i=1;i<=num1;i++){
            if (i==1){
                System.out.print(fibo1+" ");
            } else if (i==2){
                System.out.print(fibo2+" ");
            } else {
                System.out.print((fibo1+fibo2)+" ");
                aux=fibo2;
                fibo2+=fibo1;
                fibo1=aux;
            }
        }
    }
    }

