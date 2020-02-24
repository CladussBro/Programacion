package U6.T1.T1;

import java.io.*;
import java.util.Scanner;

public class prueba {
    public static void main(String[] args) {

        Scanner teclado = new Scanner(System.in);

        final String defecto="C:\\Users\\Claudia Borrachero\\IdeaProjects\\Programacion\\src\\U6\\T1\\prueba.txt";

        System.out.println("Escribe el nombre del fichero: ");
        String fichero=teclado.nextLine();

        if (fichero.isEmpty()) {
            fichero=defecto;
        }
        try {
            BufferedReader f = new BufferedReader(new FileReader(fichero));
            int c = f.read();
            while (c != -1) {
                System.out.println((char) c);
                c=f.read();
            }
            f.close();
        } catch (EOFException eof) {
            System.out.println("El fichero no se pudo abrir");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
