package U6.T2.T7;

import java.io.*;
import java.util.Scanner;

public class siete {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        ObjectOutputStream out=null;
        ObjectInputStream in=null;

        try{
            System.out.println("Escribe una frase:");
            String frase=teclado.nextLine();
            out=new ObjectOutputStream(new FileOutputStream("datos.dat"));
            out.writeObject(frase);
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
        try{
            in=new ObjectInputStream(new FileInputStream("datos.dat"));
            System.out.println((String)in.readObject());
        }catch (IOException | ClassNotFoundException e){
        }
    }
}
