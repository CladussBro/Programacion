package RECUP;

public class ej_11 {

    public static boolean esCapicua(long k){
        return k==voltea(k);
    }
    public static boolean esCapicua(int k){
        return esCapicua((long)k);
    }
    
    public static boolean esPrimo(long num) {
        if (num < 2) {
            return false;
        } else {
            for (long i = num/2; i >=2; i++) {
                if ((num % i) == 0) {
                    return false;
                }
            }
            return true;
        }
    }
    public static boolean esPrimo(int num){
        return esPrimo((long)num);
    }
    
    public static int siguientePrimo(int k){
        while(!esPrimo(++k)){};
        return k;
    }
    
    public static double potencia(int base,int exponente){
        if(exponente==0){
            return 1;
        }
        if(exponente<0){
            return 1/potencia(base,-exponente);
        }
        int num=1;
        for (int i = 0; i < Math.abs(exponente); i++) {
            num=num*base;
        }
        return num;
    }

    public static int digitos(long x) {
        if (x < 0) {
            x = -x;
        }

        if (x == 0) {
            return 1;
        } else {
            int n = 0;
            while (x > 0) {
                x = x / 10;
                n++;
            }
            return n;
        }
    }
    public static int digitos(int x) {
        return digitos((long)x);
    }
    public static long voltea(long x) {
        if (x < 0) {
            return -voltea(-x);
        }

        long volteado = 0;

        while(x > 0) {
            volteado = (volteado * 10) + (x % 10);
            x = x / 10;
        }

        return volteado;
    }
    public static int voltea(int x) {
        return (int)voltea((long)x);
    }
    public static int digitoN(long x, int n) {
        x = voltea(x);

        while (n-- > 0) {
            x = x / 10;
        }

        return (int)x % 10;
    }
    public static int digitoN(int x, int n) {
        return digitoN((long)x, n);
    }

}
