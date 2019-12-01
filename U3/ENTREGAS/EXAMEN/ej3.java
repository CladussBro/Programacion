package EXAMEN;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
    Scanner teclado = new Scanner(System.in);
        System.out.println("Introduce un número: ");
        int num=teclado.nextInt();
        int []nums=new int[num];
        for (int i = 0; i <0 ; i++) {
            nums[i]=teclado.nextInt();
        }
        System.out.print("El número en código morse es: "+convierteEnMorse(num));
    }
    public static int convierteEnMorse(int nums) {
        switch (nums) {
            case 1:
                System.out.println(".----");
                break;
            case 2:
                System.out.println("..---");
                break;
            case 3:
                System.out.println("...--");
                break;
            case 4:
                System.out.println("....-");
                break;
            case 5:
                System.out.println(".....");
                break;
            case 6:
                System.out.println("-....");
                break;
            case 7:
                System.out.println("--...");
                break;
            case 8:
                System.out.println("---..");
                break;
            case 9:
                System.out.println("----.");
                break;
            case 0:
                System.out.println("-----");
                break;
        }
        return nums;
    }
}

