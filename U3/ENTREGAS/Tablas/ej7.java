package U3_Tablas;

import java.util.Scanner;

public class ej7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int [] primer = new int [5];
        int [] segundo = new int [5];
        int [] tercer = new int [5];
        String [] nombres = {"Juan", "Pepe", "Alberto", "Sam", "Pérez"};
        int alumn;
        int suma_primer=0, suma_segundo=0, suma_tercer=0;
        double media_alumno;

        System.out.println("Notas de primer trimestre:");
        for (int i=0;i<primer.length;i++){
            System.out.print(nombres[i]+"): ");
            primer[i]=teclado.nextInt();
        }
        System.out.println("Notas del segundo trimestre:");
        for (int i=0;i<segundo.length;i++){
            System.out.print(nombres[i] +"): ");
            segundo[i]=teclado.nextInt();
        }
        System.out.println("Notas del tercer trimestre:");
        for (int i=0;i<tercer.length;i++){
            System.out.print(nombres[i]+ "): ");
            tercer[i]=teclado.nextInt();
        }
        for (int i =0; i < 5; i++)
        {
            suma_primer += primer[i];
            suma_segundo += segundo[i];
            suma_tercer += tercer[i];
        }
        System.out.println("Media primer trimestre: "+ suma_primer/5.0);
        System.out.println("Media segundo trimestre: "+ suma_segundo/5.0);
        System.out.println("Media tercer trimestre: "+ suma_tercer/5.0);
        System.out.println();
        System.out.print ("Introduce posición del alumno (de 0 a 9): ");
        alumn=teclado.nextInt();
        media_alumno = (double) (primer[alumn]+segundo[alumn]+tercer[alumn])/3;
        System.out.println("La media del alumno " + nombres[alumn]+ " es: " + media_alumno);

    }



}
