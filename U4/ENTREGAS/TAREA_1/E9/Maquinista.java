package U4.E9;

public class Maquinista {
	
	//atributos
		String nombre;
		String dni;
		double sueldo;
		String rango;
		
	//constructores
	
	public Maquinista (String nombre, String dni, double sueldo, String rango){
		this.nombre=nombre;
		this.dni=dni;
		this.sueldo=sueldo;
		this.rango=rango;
	}
	//metodos
	public void mostrarInfo(){
		System.out.println(this.nombre+" "+this.dni+" "+this.sueldo+" "+this.rango);
		
	}
}
