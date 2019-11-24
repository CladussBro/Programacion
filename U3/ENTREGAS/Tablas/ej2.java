package U3_Tablas;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir?");
        int num=teclado.nextInt();
        int [] nums=new int[num];
        System.out.println("Introduce los números: ");

        for (int i = 0; i <nums.length ; i++) {
            nums[i]=teclado.nextInt();
        }
        System.out.print("Los valores son: ");

        for (int i = nums.length-1; i>=0 ; i--) {
            System.out.print(nums[i] + " ");
        }
    }
}
