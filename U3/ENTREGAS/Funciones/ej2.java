package U3_T1;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado=new Scanner(System.in);
        System.out.println("Introduce dos números:");
        int num=teclado.nextInt();
        int num2=teclado.nextInt();
        teclado.nextLine();
        nums(num,num2);
        teclado.close();
    }

    public static void nums(int num1, int num2) {
        int mayor=0, menor=0;
        if (num1>num2) {
            mayor=num1;
            menor=num2;
        } else if (num1<num2) {
            mayor=num2;
            menor=num1;
        }
        for (int i=menor+1; i<mayor; i++) {
            System.out.print(i + " ");
        }
    }
    }

