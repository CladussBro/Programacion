package U6.T1.T2;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class datos {
    public static void main(String[] args) {
        Scanner teclado = new Scanner (System.in);
        System.out.println("Introduce el nombre y la edad: ");
        String nombre=teclado.nextLine();
        int edad=teclado.nextInt();

        try{
            BufferedWriter f = new BufferedWriter(new FileWriter("datos.txt"));
            f.write("Nombre: "+nombre);
            f.newLine();
            f.write("Edad: "+edad);
            f.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
