package U6.T2.T1;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.Scanner;

public class uno {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream out = null;

        try {
            out = new ObjectOutputStream(new FileOutputStream("src/U6/Tarea2/datos.txt"));
            System.out.println("Introducir un numero real: ");
            double x=teclado.nextDouble();

            out.writeDouble(x);
        }catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (out!=null) {
                    out.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
