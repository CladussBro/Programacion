package U7.U2.T7;

public class main {
    public static void main(String[] args) {
        listaordenada<Integer>lista1=new listaordenada<>(new listaordenada.enterosDecrecientes());
        for (int i = 0; i < 20;i++) {
            Integer temp=(int)(Math.random()*10);
            lista1.insertarorden(temp);
        }
        listaordenada<String>nombres=new listaordenada<>(new listaordenada.comparacadenas());
        nombres.insertarorden("Claudia");
        nombres.insertarorden("Carlos");
        nombres.insertarorden("Isidro");
        nombres.insertarorden("Jorge");
        nombres.insertarorden("Diego");
        System.out.println(nombres);
    }
}
