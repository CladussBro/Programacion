package U2.Prueba;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.print("Introduce el carácter para pintar el rombo: ");
        String caracter=teclado.next();
        int longitud=caracter.length();
        int i=0,j=0,k=0;
        int alt=11;

        for(i=1;i<=alt+2;i=i+2)
        {
            for(k=alt;k>=i;k=k-2)
            {
                System.out.print(" ");
            }
            for(j=0;j<i;j++)
            {
                System.out.print(caracter);
            }
            System.out.println();
        }
        for(i=longitud;i>=1;i=i-2)
        {
            for(k=i;k<=alt;k=k+2)
            {
                System.out.print(" ");
            }
            for(j=i-2;j>0;j--)
            {
                System.out.print(caracter);
            }
            System.out.println();
        }
    }
}
