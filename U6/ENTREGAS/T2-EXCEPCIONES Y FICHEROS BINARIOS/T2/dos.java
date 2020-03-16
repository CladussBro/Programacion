package U6.T2.T2;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class dos {
    public static void main(String[] args) {
        ObjectInputStream in = null;

        try {
            in = new ObjectInputStream(new FileInputStream("src/U6/Tarea2/datos.txt"));
            double x = in.readDouble();
            System.out.println("x + " + x);
        } catch (IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (in!=null) {
                    in.close();
                }
            } catch (IOException e) {
                System.out.println(e.getMessage());
            }
        }
    }
}
