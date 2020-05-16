package RECUP;

import java.util.Arrays;
import java.util.Scanner;

public class ej_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[] num = new int[10];
        int[] result=new int[10];
        int cont=0;
        int array=0;
        int primo=0;
        int prueba=0;

        System.out.println("Introduce 10 valores: ");
        for (int i = 0; i < num.length ; i++) {
            System.out.print(i+1 + ". ");
            num[i]=teclado.nextInt();
        }

        System.out.println("\nArray inicial");
        System.out.println("Índice\tValor");
        for (int i = 0; i < 10; i++) {
            System.out.println(i +"         "+ num[i]);
        }

        for (int i = 0; i < 10; i++) {
            do{
                primo++;
                prueba=num[i]%primo;
                if(prueba==0){
                    cont++;
                }else{}
            }
            while (primo!=num[i]);

                if (cont==2){
                    result[array]=num[i];
                    array++;
                }else{}
                cont=0;
                primo=0;
            }

            for (int i = 0; i < 10; i++) {
                do {
                    primo++;
                    prueba=num[i]%primo;
                    if(prueba==0){
                        cont++;
                    }else{}
                }while (primo!=num[i]);
                    if(cont!=2){
                        result[array]=num[i];
                        array++;
                    }else{}
                    cont=0;
                    primo=0;
                }
                System.out.println("\nArray final");
                System.out.println("Índice\tValor");
                for (int i = 0; i < 10; i++) {
                    System.out.println(i+"         "+result[i]);
                }
            }
        }
