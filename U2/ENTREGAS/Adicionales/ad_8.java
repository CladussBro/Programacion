package Adicionales;

import java.util.Scanner;

public class ad_8 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int dia1=0;
        int dia2=0;
        int hora1;
        int hora2;
        String dia1String;
        String dia2String;
        String nombredia1="";
        String nombredia2="";
        boolean datosCorrectos=true;

        do {
            System.out.print("Introduzca el primer día: ");
            dia1String=teclado.next();
            System.out.print("Introduzca la primera hora: ");
            hora1=teclado.nextInt();
            switch (dia1String) {
                case "lunes":
                case "1":
                    dia1 = 1;
                    nombredia1 = "lunes";
                    break;
                case "martes":
                case "2":
                    dia1 = 2;
                    nombredia1 = "martes";
                    break;
                case "miércoles":
                case "3":
                    dia1 = 3;
                    nombredia1 = "miercoles";
                    break;
                case "jueves":
                case "4":
                    dia1 = 4;
                    nombredia1 = "jueves";
                    break;
                case "viernes":
                case "5":
                    dia1 = 5;
                    nombredia1 = "viernes";
                    break;
                case "sábado":
                case "6":
                    dia1 = 6;
                    nombredia1 = "sábado";
                    break;
                case "domingo":
                case "7":
                    dia1 = 7;
                    nombredia1 = "domingo";
                    break;
                default:
                    dia1=0;
            }

            System.out.print("Introduzca el segundo día: ");
            dia2String=teclado.next();
            System.out.print("Introduzca la segunda hora: ");
            hora2=teclado.nextInt();
            switch (dia2String) {
                case "lunes":
                case "1":
                    dia2 = 1;
                    nombredia2 = "lunes";
                    break;
                case "martes":
                case "2":
                    dia2 = 2;
                    nombredia2 = "martes";
                    break;
                case "miércoles":
                case "3":
                    dia2 = 3;
                    nombredia2 = "miercoles";
                    break;
                case "jueves":
                case "4":
                    dia2 = 4;
                    nombredia2 = "jueves";
                    break;
                case "viernes":
                case "5":
                    dia2 = 5;
                    nombredia2 = "viernes";
                    break;
                case "sábado":
                case "6":
                    dia2 = 6;
                    nombredia2 = "sábado";
                    break;
                case "domingo":
                case "7":
                    dia2 = 7;
                    nombredia2 = "domingo";
                    break;
                default:
                    dia2 = 0;
            }
            datosCorrectos = true;

            if (dia2 <= dia1) {
                System.out.println("El segundo día debe ser posterior al primero");
                datosCorrectos = false;
            }

            if ((dia1 == 0) || (dia2 == 0)) {
                System.out.println("No existe día de la semana 0");
                datosCorrectos = false;
            }

            if ((hora1 < 0) || (hora1 > 23) || (hora2 < 0) || (hora2 > 23)) {
                System.out.println("No ha introducido una hora válida");
                datosCorrectos = false;
            }
        }
        while (!datosCorrectos);
            int horas = (((dia2 * 24) + hora2) - ((dia1 * 24) + hora1));
            System.out.print("Entre " + nombredia1 + " y " + nombredia2 + " hay " + horas + " horas");
    }
}


