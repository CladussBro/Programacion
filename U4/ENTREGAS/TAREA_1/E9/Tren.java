package U4.E9;

public class Tren {

	//atributos
	Locomotora locomotora;
	Vagon vagones[] = new Vagon[5];
	Maquinista maquinista;

	//constructor
	Tren (Locomotora locomotora, Maquinista maquinista){
		this.locomotora=locomotora;
		this.maquinista=maquinista;
	}
	//metodos
	void mostrarInfo(){
		locomotora.mostrarInfo();
		maquinista.mostrarInfo();
		for (int i=0;i<5;i++){
			vagones[i].mostrarInfo();
		}
	}
	
	void anadirVagon (Vagon vagon){
		for (int i=0;i<5;i++){
			if (vagones[i]==null){
				vagones[i]=vagon;
			}else{
				System.out.println("No puede haber mas de 5 vagones.");
			}
		}
	}
}