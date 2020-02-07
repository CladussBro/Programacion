package U5.ENTREGA;

public class Aereo extends Vehiculo{
    public int altitud;
    public String OACI;

    public Aereo(String nombre,int altitud,String OACI,int num_personas){
        this.nombre=nombre;
        this.altitud=altitud;
        this.OACI=OACI;
        this.num_personas=num_personas;
    }
    @Override
    public String toString() {
        return ("Nombre: "+nombre+" Altitud: "+altitud+" OACI: "+OACI+" Num Personas: "+num_personas);
    }
}
