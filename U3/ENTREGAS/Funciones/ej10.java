package U3_T1;

import java.util.Scanner;

public class ej10 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce dos números: ");
        int num = teclado.nextInt();
        int num1=teclado.nextInt();
        nums(num, num1);
    }

    public static void nums(int num, int num1) {
        int aux=0;
        for (int i = 1; i < num; i++) {
            if (num % i == 0) {
                aux=aux+i;
            }
        }
        if (num1==aux){
            System.out.println(aux+" es amigo");
        }else{
            System.out.println(aux+" no es amigo");
        }
    }
}
