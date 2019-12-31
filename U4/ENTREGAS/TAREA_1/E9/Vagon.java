package U4.E9;

class Vagon {

	//atributos
	int capacidadMax;
	int capacidadActual;
	String tipoMercancia;
	

	//constructor
	Vagon(int capacidadMax, int capacidadActual, String tipoMercancia){
		this.capacidadMax=capacidadMax;
		this.capacidadActual=capacidadActual;
		this.tipoMercancia=tipoMercancia;
	}

	//metodos
	void mostrarInfo(){
		System.out.println(this.capacidadMax+" "+this.capacidadActual+" "+this.tipoMercancia);
		}
}
