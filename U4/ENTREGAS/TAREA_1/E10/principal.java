package U4.E10;

import java.util.Scanner;

public class principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        hora h = new hora();
        System.out.println("Hora: ");
        int valor=teclado.nextInt();
        h.setHora(valor);
        System.out.println("Minuto: ");
        valor=teclado.nextInt();
        h.setMinuto(valor);
        System.out.println("Segundo: ");
        valor=teclado.nextInt();
        h.setSegundo(valor);
        System.out.println("Cuantos segundos quiere mostrar: ");
        int numSegundos=teclado.nextInt();

        for (int i = 0; i <= numSegundos; i++) {
            System.out.println(h.getHora() + ":" + h.getMinuto() + ":"+ h.getSegundo() );
            h.incrementaSegundo();
        }
    }
}
