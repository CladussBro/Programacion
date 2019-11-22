package U3_T1;

import java.util.Scanner;

public class ej12 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num = teclado.nextInt();
        System.out.print(factorial(num));
}
    public static int factorial(int num){
        int result=1;
        int aux=0;
        if (num==0){
            result=result*1;
        }else{
            result=num*factorial((num-1));
        }
        return result;
    }
}
