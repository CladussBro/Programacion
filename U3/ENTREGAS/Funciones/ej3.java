package U3_T1;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Elige una opción:");
        System.out.println("1.Área");
        System.out.println("2.Volumen");
        int eleccion=teclado.nextInt();
        float alt, base;

        switch(eleccion){
            case 1:
                System.out.print("Introduce la altura:");
                alt=teclado.nextFloat();
                System.out.print("Introduce la base:");
                base=teclado.nextFloat();
                area(base, alt);
                break;
            case 2:
                System.out.print("Introduce la altura:");
                alt=teclado.nextInt();
                System.out.print("Introduce la base:");
                base=teclado.nextInt();
                volumen(base, alt);
                break;
            default:
                System.out.print("Error");
        }

    }

    public static void area(float base, float alt){
        double area_total=2*Math.PI*base*(alt+base);
        System.out.print("El area es: "+area_total);
    }

    public static void volumen(float base, float alt){
        double volumen_total=Math.PI*Math.pow(base,2)*alt;
        System.out.print("El volumen es: "+volumen_total);
    }
}
