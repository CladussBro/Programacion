package U4.E6;

public class principal {
    public static void main(String[] args) {

        Banco b1 = new Banco("BBVA", "Calle Pascual");
        Banco b2 = new Banco("Caixa", "Calle Feria");
        CuentaCorriente6 c1 = new CuentaCorriente6("Claudia", "53343849H", b1);
        CuentaCorriente6 c2 = new CuentaCorriente6("Carlos", "17452732P");

        c1.ingresarDinero(100);
        c1.mostrarInformacion();

        System.out.println();

        if (c1.sacarDinero(60)) {
            System.out.println("Operación realizada exitosamente.");
        } else {
            System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
        }
        if (c1.sacarDinero(95)) {
            System.out.println("Operación realizada exitosamente.");
        } else {
            System.out.println("NO SE HA PODIDO SACAR EL DINERO.");
        }

        System.out.println();

        c1.cambiarNombreB(b2);
        c1.mostrarInformacion();

        System.out.println("\n");

        c2.mostrarInformacion();
        c2.cambiarNombreB(b2);
        c2.mostrarInformacion();
    }
}
