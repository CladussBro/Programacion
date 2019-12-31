package U4.E8;

public class principal {
    public static void main(String[] args) {
        bombilla b1 = new bombilla();
        bombilla b2 = new bombilla();
        b1.encender();
        System.out.println(b1.mostrar());
        b2.apagar();
        System.out.println(b2.mostrar());
        bombilla.intG=false;
        System.out.println(b1.mostrar());
        System.out.println(b2.mostrar());
        bombilla.intG=true;
        System.out.println(b1.mostrar());
        System.out.println(b2.mostrar());
    }
}
