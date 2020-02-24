package U6.T1.T8;

import java.io.*;

public class todos {
    public static void main(String[] args) throws Exception{
        try{
            final String perso1="src/U6/T1/T8/persona1.txt";
            final String perso2="src/U6/T1/T8/persona2.txt";
            BufferedReader p1= new BufferedReader(new FileReader(perso1));
            BufferedReader p2= new BufferedReader(new FileReader(perso2));
            BufferedWriter todos= new BufferedWriter(new FileWriter("todos.txt"));

            String nombre1=p1.readLine();
            String nombre2=p2.readLine();

            while(nombre1!=null && nombre2!=null){
                if (nombre1.compareToIgnoreCase(nombre2)<0){
                    todos.write(nombre1);
                    todos.newLine();
                    nombre1=p1.readLine();
                }else{
                    todos.write(nombre2);
                    todos.newLine();
                    nombre2=p2.readLine();
                }
            }

            if (nombre1==null){
                todos.write(nombre2);
                todos.newLine();
                nombre2=p2.readLine();
            }else{
                while(nombre1!=null){
                    todos.write(nombre1);
                    todos.newLine();
                    nombre1=p1.readLine();
                }
            }
            p1.close();
            p2.close();
            todos.close();

        } catch (EOFException e) {
            System.out.println("No se puede abrir el fichero");;
        }catch (FileNotFoundException e){
            System.out.println("No se encontro el fichero");
        }
    }
}
