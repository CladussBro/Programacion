package U6.T2.T5;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;

public class cinco {
    public static void main(String[] args) {
        ObjectInputStream in=null;
        try{
            in=new ObjectInputStream(new FileInputStream("datos.dat"));
            double tabla[]=(double[])in.readObject();
            System.out.println(Arrays.toString(tabla));
        }catch (IOException | ClassNotFoundException e){
            System.out.println(e.getMessage());
        }finally {
            try{
                if (in!=null){
                    in.close();
                }
            }catch (IOException e){
                System.out.println(e);
            }
        }
    }
}
