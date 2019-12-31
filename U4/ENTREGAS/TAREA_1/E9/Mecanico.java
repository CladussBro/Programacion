package U4.E9;

public class Mecanico {

	//atributos
	String nombre;
	int tlfno;
	String especialidad;
	
	//constructor
	public Mecanico (String nombre, int tlfno, String especialidad){
		this.nombre=nombre;
		this.tlfno=tlfno;
		this.especialidad=especialidad;
	}
	//metodos
	public String getNombre(){
		return this.nombre;
	}
	
	public void mostrarInfo(){
		System.out.println(this.nombre+" "+this.tlfno+" "+this.especialidad);
		}
}
