package PRUEBA3;

import java.util.Arrays;
import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce 5 números");
        int num;
        int[] nums = new int[5];
        for (int i = 0; i < nums.length; i++) {
            nums[i] = teclado.nextInt();
        }
    }

    public int[] filtraCon7(int x[]) {
        int permitidos = 7;
        Arrays.asList(permitidos).contains(x);
    }
}
