package RECUP;

public class ej_17 {
    public static void main(String[] args) {
        int[]num={1,5,9,3,4,6};
        System.out.println(convierteArrayEnString(num));
    }
    public static String convierteArrayEnString(int[] a) {
        String cadena = "";
        for (int i = 0; i < a.length; i++) {
            cadena = cadena + a[i];
        }
        return cadena;
    }
}
