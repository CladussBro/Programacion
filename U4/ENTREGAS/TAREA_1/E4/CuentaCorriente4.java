package U4.E4;

public class CuentaCorriente4 {
    private double saldo;
    private int limite_descubierto;
    private String nombre;
    private String dni;
    private String banco="Caixa";

    public CuentaCorriente4(String nombre, String dni){
        saldo=0;
        this.nombre=nombre;
        this.dni=dni;
        limite_descubierto=-50;
    }
    public CuentaCorriente4(double saldo){
        this.saldo=0;
        limite_descubierto=-50;
    }
    public CuentaCorriente4(String dni, double saldo,int limite_descubierto){
        this.saldo=0;
        this.dni=dni;
        limite_descubierto=-50;
    }
    public void bancoName(String bancaso){
        banco=bancaso;
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
        System.out.println("Nombre banco: "+banco);
    }
}
