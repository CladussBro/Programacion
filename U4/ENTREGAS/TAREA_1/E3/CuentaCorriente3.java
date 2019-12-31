package U4.E3;

public class CuentaCorriente3 {
    private double saldo;
    private int limite_descubierto;
    public String nombre;
    protected String dni;

    public CuentaCorriente3(String nombre, String dni){
        saldo=0;
        this.nombre=nombre;
        this.dni=dni;
        limite_descubierto=-50;
    }
    public CuentaCorriente3(double saldo){
        this.saldo=0;
        limite_descubierto=-50;
    }
    public CuentaCorriente3(String dni, double saldo,int limite_descubierto){
        this.saldo=0;
        this.dni=dni;
        limite_descubierto=-50;
    }
    public boolean sacar_dinero(double peticion){
        boolean resultado=false;
        if ((saldo-peticion)>=limite_descubierto){
            saldo-=peticion;
            resultado=true;
            System.out.println("Se han sacado "+peticion+" euros");
        }else {
            System.out.println("No se ha podido realizar la operación");
        }
        return resultado;
    }
    public void ingresar_dinero(double ingreso){
        saldo+=ingreso;
    }
    public void mostrar_informacion(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Saldo: "+saldo);
        System.out.println("Límite: "+limite_descubierto);
    }
}
