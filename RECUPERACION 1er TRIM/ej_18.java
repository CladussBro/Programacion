package RECUP;

import java.util.Arrays;

import static RECUP.ej_11.esCapicua;

public class ej_18 {
    public static int[] filtraPrimos(int[] v) {
        int num = 0;
        for (int i = 0; i < v.length; i++) {
            boolean primo = true;
            if (v[i] == 1) {
                num++;
            } else {
                for (int j = 2; j < v[i]; j++) {
                    if (v[i] % j == 0) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    num++;
                }
            }
        }

        if (num == 0) {
            int[] t = {-1};
            return t;
        } else {
            int[] t = new int[num];
            int cont = 0;
            for (int i = 0; i < v.length; i++) {
                boolean primo = true;
                if (v[i] == 1) {
                    t[cont] = 1;
                    cont++;
                } else {
                    for (int j = 2; j < v[i]; j++) {
                        if (v[i] % j == 0) {
                            primo = false;
                            break;
                        }
                    }
                    if (primo) {
                        t[cont] = v[i];
                        cont++;
                    }
                }
            }
            return t;
        }
    }

    public static void main(String[] args) {
        int[] num = new int[10];
        for (int i = 0; i < num.length; i++) {
            num[i] = (int) (Math.random() * (100 - 0) + 2);
            System.out.print(num[i]+" | ");
        }
        System.out.println( );
        System.out.println("Primos: ");
        System.out.println(Arrays.toString(filtraPrimos(num)));
    }
}
