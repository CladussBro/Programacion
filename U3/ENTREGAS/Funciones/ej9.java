package U3_T1;

import java.util.Scanner;

public class ej9 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num = teclado.nextInt();
        divisoresPrimos(num);
    }

    static void divisoresPrimos(int num){
        boolean primo = true;
        for (int i=1;i<=num;i++){
            if (num%i==0){
                for (int j=2;j<i && primo;++j){
                    if (i%j==0){
                        primo =false;
                    }
                }
                if (primo){
                    System.out.println (i+" es primo");
                }
            }
        }
    }
}

