package U6.T1.T5;

import java.io.BufferedReader;
import java.io.FileReader;

public class numeros {
    public static void main(String[] args) throws Exception {

        final String defecto = "src/U6/T5/numeros.txt";
        BufferedReader f = new BufferedReader(new FileReader(defecto));
        int num, max, min;

        String c = f.readLine();
        num = Integer.valueOf(c);
        max = num;
        min = num;

        c = f.readLine();
        while (c != null) {
            num = Integer.valueOf(c);
            if (num > max) {
                max = num;
            }
            if (num < min) {
                min = num;
            }
            c = f.readLine();
        }
        f.close();
        System.out.println("Mayor: "+max);
        System.out.println("Menor: "+min);
    }
}
