package Tarea8;

import java.util.Scanner;

public class ej8_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Intente adivinar el número aleatorio del 1 al 100, si introduces -1 te habrás rendido");
        int num1=teclado.nextInt();

         int num_azar=(int)(Math.random()*101);

         while(num1!=num_azar && num1>0){
             if(num1>num_azar){
                 System.out.println("El número introducido es mayor");
                 num1=teclado.nextInt();
             }
             if(num1<num_azar){
                 System.out.println("El número introducido es menor");
                 num1=teclado.nextInt();
             }
             if(num1==num_azar){
                 System.out.println("Ha adivinado el número:"+num_azar);
                 num1=teclado.nextInt();
             }
         }

        if (num1==-1) {
            System.out.println("Te has rendido");
        }
    }
}
