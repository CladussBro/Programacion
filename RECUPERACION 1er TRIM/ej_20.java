package RECUP;

import java.util.Arrays;
import java.util.Random;

public class ej_20 {
    public static void main(String[] args) {
        System.out.println();
        int numeros[] = new int[5];
        llenarArray(numeros);
        visualizar(numeros);
        System.out.println("\nArray: ");
        ocurrencias(numeros);
    }

    static void visualizar(int[] pArray){
        System.out.println(Arrays.toString(pArray));
    }

    static void llenarArray(int[] pArray){
        Random r = new Random();
        for(int i=0;i<pArray.length;i++){
            pArray[i] = r.nextInt(20) + 1;
        }
    }
    static void ocurrencias(int[] pArray){
        for(int i=0;i<pArray.length-1;i++){
            for(int j=i+1;j<pArray.length;j++){
                if(pArray[i]==pArray[j]){
                    System.out.println("Número repetido: " + pArray[i]);
                }
            }
        }
    }
}
