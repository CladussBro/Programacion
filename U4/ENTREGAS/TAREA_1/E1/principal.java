package U4.E1;


import javax.swing.*;

public class principal {
    public static void main(String[] args) {
        CuentaCorriente c = new CuentaCorriente("Cladus","12345678C");
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
