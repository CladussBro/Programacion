package U6.T2.T4;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Locale;
import java.util.Scanner;

public class cuatro {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        teclado.useLocale(Locale.US);
        ObjectOutputStream out=null;

        try{
            System.out.println("Número de elementos:");
            int n=teclado.nextInt();
            double tabla[]=new double[n];
            out=new ObjectOutputStream(new FileOutputStream("datos.dat"));
            for (int i = 0; i < tabla.length; i++) {
                System.out.println("Introduce un número:");
                tabla[i]=teclado.nextDouble();
            }
            out.writeObject(tabla);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (out!=null){
                    out.close();
                }
            }catch (IOException e){
            }
        }
    }
}
