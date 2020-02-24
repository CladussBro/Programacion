package U6.T1.T3;

import java.io.*;
import java.util.Scanner;

public class dupli {
    public static void main(String[] args) throws IOException {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Fichero fuente: ");
        String fuente = teclado.nextLine();
        String destino = nombreFichero(fuente);

        try {
            BufferedReader f1 = new BufferedReader(new FileReader(fuente));
            BufferedWriter f2 = new BufferedWriter(new FileWriter(destino));

            int c = f1.read();
            while (c != -1) {
                f2.write(c);
                c=f1.read();
            }
        } catch (EOFException | FileNotFoundException eof) {
            System.out.println("Error de fichero");
        }
    }

    static String nombreFichero(String nombre) {
        String newNombre;

        int pos=nombre.lastIndexOf('/');
        if (pos==-1) {
            newNombre="copia_de_"+nombre;
        } else {
            newNombre=nombre.substring(0, pos+1) + "copia_de_" + nombre.substring(pos+1);
        }
        return newNombre;
    }
}
