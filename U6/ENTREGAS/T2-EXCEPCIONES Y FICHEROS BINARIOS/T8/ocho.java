package U6.T2.T8;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.Arrays;

public class ocho {
    public static void main(String[] args) {
        ObjectOutputStream out=null;
        ObjectInputStream in=null;
        int tabla[]=new int[10];

        try{
            for (int i = 0; i < tabla.length; i++) {
                tabla[i]=(int)(Math.random()*100);
            }
            out=new ObjectOutputStream(new FileOutputStream("datos.dat"));
            Arrays.sort(tabla);
            out.writeObject(tabla);
        }catch (IOException e){
            System.out.println(e.getMessage());
        }finally {
            if (out!=null) {
                try {
                    out.close();
                }catch (IOException e){
                    System.out.println(e.getMessage());
                }
            }
        }
    }
}
