package Tarea8;

import java.util.Scanner;

public class ej8_13 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int contAprov=0, contCond=0, contSusp=0;

        for(int i=0;i<6;i++){
            System.out.println("Introduce la nota");
            int nota=teclado.nextInt();

            if(nota>=5){
                contAprov++;
            }
            else if(nota==4){
                contCond++;
            }
            else{
                contSusp++;
            }
        }
        System.out.println("Hay "+contAprov+" aprovados, "+contCond+" condicionados y "+contSusp+" suspensos");
    }
}
