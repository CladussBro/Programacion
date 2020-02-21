package U6.T1.T6;

import java.io.*;
import java.util.Scanner;

public class firmas {
    public static void main(String[] args) throws Exception{
        Scanner teclado = new Scanner (System.in);
        System.out.println("1.Mostrar libro de firmas: ");
        System.out.println("2.Añadir nombre: ");
        int choose=teclado.nextInt();
        teclado.nextLine();

        switch (choose){
            case 1:
                FicheroFirmas();
                break;
            case 2:
                System.out.println("Introduce el nombre en el libro de firmas: ");
                String nombre=teclado.nextLine();
                NuevaFirma(nombre);
                break;
        }
    }
    private static void FicheroFirmas() throws Exception {
        try {
            final String defecto="src/U6/T1/T6/firmas.txt";
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            String linea = f.readLine();
            while (linea != null) {
                System.out.println(linea);
                linea = f.readLine();
            }
            f.close();
        } catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
    private static void NuevaFirma(String nuevo) throws Exception{
        try {
            final String defecto="src/U6/T1/T6/firmas.txt";
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            String nombre=f.readLine();
            boolean encontrado=false;

            while(nombre!=null && encontrado==false){
                if (nombre.equals(nuevo)){
                    encontrado=true;
                }
                nombre=f.readLine();
            }
            f.close();

            if (encontrado=false){
                BufferedWriter w = new BufferedWriter(new FileWriter(defecto,true));
                w.newLine();
                w.write("Nombre: "+nuevo);
                System.out.println("\n Se ha insertado un nuevo nombre.");
                w.close();
            }else{
                System.out.println("\n Ya ha firmado anteriormente.");
            }
        } catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
}
