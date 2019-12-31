package U4.E4;

import U4.E4.CuentaCorriente4;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente4 c = new CuentaCorriente4("Claudia","12345678C");
        CuentaCorriente4 c1 = new CuentaCorriente4(100);
        CuentaCorriente4 c2 = new CuentaCorriente4("12345678C",100,5);
        c2.bancoName("BBVA");
        c2.mostrar_informacion();
    }
}
