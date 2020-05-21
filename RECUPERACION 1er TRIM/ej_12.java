package RECUP;

import static RECUP.ej_11.*;

public class ej_12 {
    public static int posicionDeDigito(long x, int d) {
        int i;

        for (i = 0; (i < digitos(x)) && (digitoN(x, i) != d); i++) {};

        if (i == digitos(x)) {
            return -1;
        } else {
            return i;
        }
    }
    public static int posicionDeDigito(int x, int d) {
        return posicionDeDigito((long)x, d);
    }
    public static long quitaPorDetras(long x, int n) {
        return x / (long)potencia(10, n);
    }
    public static int quitaPorDetras(int x, int n) {
        return (int)quitaPorDetras((long) x, n);
    }
    public static long quitaPorDelante(long x, int n) {
        x = pegaPorDetras(x, 1);
        x = voltea(quitaPorDetras(voltea(x), n));
        x = quitaPorDetras(x, 1);
        return x;
    }
    public static int quitaPorDelante(int x, int n) {
        return (int)quitaPorDelante((long)x, n);
    }
    public static long pegaPorDetras(long x, int d) {
        return juntaNumeros(x, d);
    }
    public static int pegaPorDetras(int x, int d) {
        return (int)pegaPorDetras((long)x, d);
    }
    public static long pegaPorDelante(long x, int d) {
        return juntaNumeros(d, x);
    }
    public static int pegaPorDelante(int x, int d) {
        return (int)pegaPorDelante((long)x, d);
    }
    public static long trozoDeNumero(long x, int inicio, int fin) {
        int longitud = digitos(x);
        x = quitaPorDelante(x, inicio);
        x = quitaPorDetras(x, longitud - fin - 1);
        return x;
    }
    public static int trozoDeNumero(int x, int inicio, int fin) {
        return (int)trozoDeNumero((long)x, inicio, fin);
    }
    public static long juntaNumeros(long x, long y) {
        return (long)(x * potencia(10, digitos(y))) + y;
    }
    public static int juntaNumeros(int x, int y) {
        return (int)(juntaNumeros((long)x, (long)y));
    }
}
