package RECUP;

import java.util.Scanner;

public class ej_14 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num=teclado.nextInt();
        int[] n =new int[num];
        for (int i = 0; i <0 ; i++) {
            n[i]=teclado.nextInt();
        }
        System.out.print("El número en código morse es: "+convierteEnMorse(num));
    }
    public static int convierteEnMorse(int n) {
        switch (n) {
            case 1:
                System.out.println(". _ _ _ _");
                break;
            case 2:
                System.out.println(".. _ _ _");
                break;
            case 3:
                System.out.println("... _ _");
                break;
            case 4:
                System.out.println("...._");
                break;
            case 5:
                System.out.println(".....");
                break;
            case 6:
                System.out.println("_....");
                break;
            case 7:
                System.out.println("_ _...");
                break;
            case 8:
                System.out.println("_ _ _..");
                break;
            case 9:
                System.out.println("_ _ _ _.");
                break;
            case 0:
                System.out.println("_ _ _ _ _");
                break;
        }
        return n;
    }
}
