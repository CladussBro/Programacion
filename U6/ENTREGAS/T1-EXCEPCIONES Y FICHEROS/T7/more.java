package U6.T1.T7;

import java.io.*;
import java.util.Scanner;

public class more {
    public static void main(String[] args) throws Exception{
        Scanner teclado=new Scanner(System.in);
        int contador=0;

        try{
            final String defecto="src/U6/T1/T7/more.txt";
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            String linea=f.readLine();
            while(linea!=null){
                System.out.println(linea);
                contador++;
                if (contador==24){
                    System.out.println();
                    System.out.println("Intro for more");
                    teclado.nextLine();
                    System.out.println();
                    contador=0;
                }
                linea=f.readLine();
            }
            f.close();
        }catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
}
