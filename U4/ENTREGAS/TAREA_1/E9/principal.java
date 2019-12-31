package U4.E9;

public class principal {
    public static void main(String[] args) {
        Maquinista conductor = new Maquinista("Zaira", "123456", 1000, " Principiante ");
        Mecanico meca = new Mecanico("Alexander", 65235345, "Bujias");
        Jefe jefe = new Jefe("Mohamed", "123457");
        Locomotora locomotor = new Locomotora("1234567", 235, 1998, meca);
        Tren trenecito = new Tren(locomotor, conductor);
        Vagon vagon1 = new Vagon(100, 50, "Portatil MSI");
        trenecito.anadirVagon(vagon1);
        System.out.print("Toda la informacion del tren es: ");
        trenecito.mostrarInfo();
        System.out.println();
    }
}
