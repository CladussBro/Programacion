package U2.Tarea_8;

import java.util.Scanner;

public class ej8_2 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        int suma=0, contador=0, mayores=0;
        double media=0;


        System.out.println("Cual es su edad");
        int edad=teclado.nextInt();


        while (edad>=0) {
            suma=suma+edad;
            contador++;
            media=suma/contador;
            if (edad>=18) {
                mayores++;
            }
            System.out.println("Cual es su edad");
            edad=teclado.nextInt();


        }
        System.out.println("La suma de todas las edades que has introducido es: " + suma);
        System.out.println("La media de las edades introducidas es: " + media);
        System.out.println("Las personas introducidas han sido: " + contador);
        System.out.println("Las persones mayores de edad son: " + mayores);
    }
}
