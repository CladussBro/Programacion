package Tarea9;

import java.util.Scanner;

public class ej9_2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Jugador 1: Introduce la contraseña: ");
        String j1=teclado.next();
        System.out.println("Jugador 2: Juguemos, intenta adivinar la contraseña");
        int contra=j1.length();
        System.out.println("Pista 1: El número de carácteres es de: "+contra);
        System.out.println("Pista 2: El primer carácter es " + j1.charAt(0) + " y el último es " + j1.charAt(contra-1));
        System.out.print("Introduce tu respuesta:");
        String j2=teclado.next();

        if(j1.equals(j2)){
            System.out.println("Acertaste");
        }else{
            System.out.print("Fallaste");
        }
    }
}
