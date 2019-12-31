package U4.E9;

public class Locomotora {

	//atributos
	String matricula;
	int potencia;
	int anoFabricacion;
	Mecanico mecanico;
	
	//constructores
	public Locomotora (String matricula, int potencia, int anoFabricacion, Mecanico mecanico){
		this.matricula=matricula;
		this.potencia=potencia;
		this.anoFabricacion=anoFabricacion;
		this.mecanico=mecanico;
	}
	//metodos
	public void mostrarInfo(){
		System.out.println(this.matricula+" "+this.potencia+" "+this.anoFabricacion);
		mecanico.mostrarInfo();
	}
}