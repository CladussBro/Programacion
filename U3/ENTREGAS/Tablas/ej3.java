package U3_Tablas;

import java.util.Scanner;

public class ej3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("¿Cuántos números desea introducir?");
        int n=teclado.nextInt();
        int [] nums=new int[n];
        int suma_pos=0, suma_neg=0;
        int media_pos=0, media_neg=0;
        int cont_pos=0, cont_neg=0, cont_cero=0;

        System.out.println("Introduce "+n+" números: ");

        for (int i = 0; i <nums.length ; i++) {
            nums[i]=teclado.nextInt();

            if(nums[i]>0){
                suma_pos=suma_pos+nums[i];
                cont_pos++;
            }
            else if (nums[i]<0){
                suma_neg=suma_neg+nums[i];
                cont_neg++;
            }else {
                cont_cero++;
            }
        }
        media_pos = suma_pos / cont_pos;
        media_neg = suma_neg / cont_neg;

        System.out.println("Media de positivos: " + media_pos);
        System.out.println("Media de negativos: " + media_neg);
        System.out.println("Hay: "+cont_cero+" ceros");
    }
}
