package RECUP;
import java.util.Arrays;

public class ej_13 {
    public static int[] filtraPrimos(int[] v) {
        int num = 0;
        for (int i = 0; i < v.length ; i++) {
            boolean primo = true;
            if (v[i]==1) {
                num++;
            } else {
                for (int j=2;j<v[i];j++) {
                    if (v[i]%j == 0 ) {
                        primo = false;
                        break;
                    }
                }
                if (primo) {
                    num++;
                }
            }
        }

        if (num==0) {
            int[] t = {-1};
            return t;
        } else {
            int[] t = new int[num];
            int cont = 0;
            for (int i = 0; i < v.length ; i++) {
                boolean primo = true;
                if (v[i]==1) {
                    t[cont] = 1;
                    cont++;
                } else {
                    for (int j = 2; j<v[i]; j++) {
                        if (v[i]%j == 0 ) {
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
        int[] datos = {2,3,6,7,11,13,18,19,28,30};
        System.out.println(Arrays.toString(filtraPrimos(datos)));
    }
}