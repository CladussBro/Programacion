package U6.T1.T4;

import java.io.*;

public class leer {
    public static void main(String[] args) {

        final String defecto="src/U6/T4/carta.txt";

        try {
            BufferedReader f = new BufferedReader(new FileReader(defecto));
            int caracter=0;
            int lineas=0;
            int palabras=0;

            int c=f.read();

            while (c != -1) {
                if ((char)c==' '){
                    caracter++;
                    palabras++;
                }else{
                    if ((char)c=='\n'){
                        palabras++;
                        lineas++;
                    }else{
                        caracter++;
                    }
                }
                c=f.read();
            }
            f.close();
            if (palabras>0){
                palabras++;
            }
            if (lineas>0){
                lineas++;
            }
            System.out.println("Caracteres: "+(caracter-1));
            System.out.println("Lineas: "+(lineas+1));
            System.out.println("Palabras: "+(palabras+1));
        } catch (EOFException eof) {
            System.out.println("El fichero no se pudo abrir");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
