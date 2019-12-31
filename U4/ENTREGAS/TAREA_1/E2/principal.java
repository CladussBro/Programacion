package U4.E2;

import U4.E1.CuentaCorriente;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente2 c = new CuentaCorriente2("Claudia","12345678C");
        CuentaCorriente2 c1 = new CuentaCorriente2(100);
        CuentaCorriente2 c2 = new CuentaCorriente2("12345678C",100,5);
        c.mostrar_informacion();
        c.ingresar_dinero(100);
        c.mostrar_informacion();

        if (c.sacar_dinero(60)){
            System.out.println("Se ha retirado dinero desde el principal");
        }else{
            System.out.println("No se ha retirado dinero desde el principal");
        }
        c.mostrar_informacion();

        if (c.sacar_dinero(95)){
            System.out.println("Se ha retirado dinero desde el principal");
        }else{
            System.out.println("No se ha retirado dinero desde el principal");
        }

        c.mostrar_informacion();
    }
}
