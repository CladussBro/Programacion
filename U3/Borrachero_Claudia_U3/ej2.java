package RECUP;

import java.util.Scanner;

public class ej2 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Indique el número de números dentro del arrays:");
        long x=teclado.nextLong();
        long [] tabla=new long[(int) x];
        for (int i = 0; i <tabla.length ; i++) {
            tabla[i] = (int) (Math.random() * (9));
        }
        System.out.println("Introduce una posición inicial y una final: ");
        int inicio=teclado.nextInt();
        int fin=teclado.nextInt();

        System.out.println("Los números resultantes son: "+(trozoDeNumero(x,inicio,fin)));;

        public static long trozoDeNumero(long x,  int inicio,  int fin){
            for (int i = inicio; i < fin; i++) {
                System.out.println(tabla[i]+" ");
            }
        }
    }
}
