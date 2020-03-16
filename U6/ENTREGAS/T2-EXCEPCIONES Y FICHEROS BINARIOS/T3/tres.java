package U6.T2.T3;

import java.io.*;
import java.util.Scanner;

public class tres {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        ObjectOutputStream out=null;
        ObjectInputStream in=null;
        int contador=0;

        try{
            out=new ObjectOutputStream(new FileOutputStream("datos.dat"));
            System.out.println("Introduce numero entero:");
            int x=teclado.nextInt();
            while (x>=0){
                contador++;
                out.writeInt(x);
                System.out.println("Introduce numero entero:");
                x=teclado.nextInt();
            }
        }catch(IOException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (out!=null){
                    out.close();
                }
            }catch (IOException e){
            }
        }
        try{
            in=new ObjectInputStream(new FileInputStream("datos.dat"));
            for (int i = 0; i < contador; i++) {
                int x=in.readInt();
                System.out.println(x);
            }
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            try {
                if (in!=null){
                    in.close();
                }
            }catch (IOException e){
            }
        }
    }
}
