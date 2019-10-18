package Tarea9;

import java.util.Scanner;

public class ej9_5 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        final String prefijo="Javalín, javalón";
        final String sufijo="javalén, len, len";
        System.out.println("Escribe una frase");
        String entrada=teclado.next();
        boolean idiomaJavalandia=false;

        if(entrada.startsWith(prefijo)){
            idiomaJavalandia=true;
            entrada=entrada.substring(prefijo.length());
        }
        else if(entrada.startsWith(sufijo)){
            idiomaJavalandia=true;
            entrada=entrada.substring(0, entrada.length()-sufijo.length());
        }
        if(idiomaJavalandia){
            entrada=entrada.trim();
            System.out.println(entrada);
        }
        else{
            System.out.println("No está escrito en idioma de Javalandia");
        }
    }
}
