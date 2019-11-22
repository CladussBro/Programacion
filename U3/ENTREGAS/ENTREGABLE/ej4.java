package PRUEBA3;

import java.util.Scanner;

public class ej4 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int[]a={};
        int[]b={8};
        int[]c={6,2,5,0,1};

        System.out.println(convierteArrayEnString(a));
        System.out.println(convierteArrayEnString(b));
        System.out.println(convierteArrayEnString(c));
    }
    public static String convierteArrayEnString(int[] a){
        String num="";
        for (int value:a) {
            num=num+value;
        }
        return num;
    }
}
