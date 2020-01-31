package U5.T1.U7;

public class principal {
    public static void main(String[] args) {
        Caja a, b;
        a = new Caja(100,200,200, Caja.Unidades.CM);
        a.etiqueta = "Antonio Pérez. Calle Larga n 8";
        b = new Caja(1.2, 0.9, 1.45, Caja.Unidades.M);
        b.etiqueta = "Isidro Pérez. Entregar antes de las 22:30h";

        System.out.println(a);
        System.out.println("Volumen: " + a.getVolumen());
        System.out.println(b);
        System.out.println("Volumen: " + b.getVolumen());
    }
}
