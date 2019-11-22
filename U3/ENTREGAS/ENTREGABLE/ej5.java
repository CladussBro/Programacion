package PRUEBA3;

import java.util.Scanner;

public class ej5 {
    public static void main(String[] args) {
        int a[]={111,222,333,444};
        int b[]={52,37};

        System.out.println(aleatorioDeArray(a));
        System.out.println(aleatorioDeArray(b));
    }

    public static int aleatorioDeArray(int[] a) {
        int num=0, aleatorio=0;
        aleatorio = (int) (Math.random() * a.length+1);

        if (aleatorio==1) {
            num=a[aleatorio-1];
        } else if (aleatorio==2) {
            num=a[aleatorio-1];
        } else if (aleatorio==3) {
            num=a[aleatorio-1];
        } else if (aleatorio==4) {
            num=a[aleatorio-1];
        }
        return num;
    }
}
