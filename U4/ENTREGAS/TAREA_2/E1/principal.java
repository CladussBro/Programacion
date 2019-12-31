package U4.TAREA2.EJ1;

public class principal {
    public static void main(String[] args){
        lista l=new lista();
        l.insertarFinal(3);
        l.insertarFinal(2);
        l.insertarFinal(1);
        l.insertarFinal(4);
        l.insertarFinal(5);
        System.out.println(l.mostrar());

        l.insertarPrincipio(0);
        l.insertarPrincipio(1);
        l.insertarPrincipio(2);
        l.insertarPrincipio(3);
        l.insertarPrincipio(4);
        System.out.println(l.mostrar());

        l.insertar(2,10);
        System.out.println(l.mostrar());
        l.eliminar(2);
        System.out.println(l.mostrar());
    }
}
