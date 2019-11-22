package U3_T1;

import java.util.Scanner;

public class ej1 {
    public static void main(String[] args) {
    Scanner teclado=new Scanner(System.in);
    System.out.print("Introduce un número:");
    int num=teclado.nextInt();
    teclado.nextLine();
    eco(num);
    teclado.close();

    }

    public static void eco(int num){
        for (int i=0;i<num;i++) {
            System.out.print("Eco...");
        }
    }
}
