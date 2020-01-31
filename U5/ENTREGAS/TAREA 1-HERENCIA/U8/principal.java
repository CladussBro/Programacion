package U5.T1.U8;

import U5.T1.U7.Caja;

public class principal {
    public static void main(String[] args) {
        Caja a = new CajaCarton(100,200,200);
        a.etiqueta = "Dirección de envio";
        System.out.println(a);
        System.out.println("Volumen: " + ((CajaCarton) a).getVolumen());

        CajaCarton b = new CajaCarton(50.6, 75.5 , 100);
        b.etiqueta = 23;
        System.out.println(b.etiqueta);
        System.out.println(b);
        System.out.println("Volumen: " +b.getVolumen());
    }
}
