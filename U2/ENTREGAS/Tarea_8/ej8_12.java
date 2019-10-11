package Tarea8;

import java.util.Scanner;

public class ej8_12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int nota;
        boolean suspensos=false;

        for(int i=0;i<5;i++){
            System.out.println("Introduce una nota");
            nota=teclado.nextInt();
            if(nota<5){
                suspensos=true;
            }
            if(suspensos=true){
                System.out.println("Existen alumnos suspensos en la materia");
            }
            else{
                System.out.println("No hay ningún alumno suspenso");
            }
        }
    }
}
