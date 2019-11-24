package U3_Tablas;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);
        int contador=10;
        boolean acierto=true;

        System.out.println("De cuanto deseas que sea la longitud");
        int  num1= teclado.nextInt();

        double [] clavesita = new double[num1];
        double [] intentito = new double[num1];

        for (int i = 0; i < clavesita.length ; i++) {
            clavesita[i]= Math.floor(Math.random()*5+1);
        }
        for (int i = 0; i < intentito.length; i++) {
            intentito[i]=teclado.nextDouble();
            if (clavesita[i]==intentito[i]) {
                System.out.println(intentito[i] + " es iguales");
            } else if (clavesita[i]!=intentito[i]) {
                System.out.println(intentito[i] + " es distinto");
                pista(intentito[i], clavesita[i]);
            }
        }
    }
    static void pista(double intento, double clave){
        if (intento>clave) {
            System.out.println("El numero introducido es mayor a la clave");
        } else {
            System.out.println("El numero introducido es menor a la clave");
        }
    }
}
