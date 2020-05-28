package U2.Prueba;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
        System.out.println("Introduce las notas de los alumnos");
        Scanner teclado = new Scanner(System.in);
        System.out.print("Nota del primer control: ");
        short nota1=teclado.nextShort();
        teclado.nextLine();
        System.out.print("Nota del segundo control: ");
        short nota2=teclado.nextShort();
        teclado.nextLine();
        System.out.print("Nota del tercer control: ");
        short nota3=teclado.nextShort();
        teclado.nextLine();
        int suma=nota1+nota2+nota3;
        double media=suma/3;

        System.out.println("Tu nota de Programación es: "+media);
        if(media>=5 && media<=10) {
            if (media >= 5 && media < 6) {
                System.out.println("Su nota de programación es: Suficiente "+media);
            } else if (media >= 6 && media < 7) {
                System.out.println("Bien");
            } else if (media >= 7 && media < 9) {
                System.out.println("Notable");
            } else {
                System.out.println("Sobresaliente");
            }
        }else{
            System.out.println("El resultado de la recuperación ha sido (apto/no apto)");
            String recuperacion=teclado.next();
            teclado.nextLine();
            if(recuperacion.equals("apto")){
                System.out.println("Tu nota de Programación es Suficiente 5.0");
            }else{
                System.out.println("Tu nota de Programación es: "+media);
            }
        }
}
}
