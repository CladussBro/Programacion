package T5;

public class futbolista {
    private final Object sitio;
    private int numero;
    private String nombre;
    private String equipo;

    enum sitio{
        portero,lat_der,med_centro,central,lat_izq,def_medcampo,
        med_campo,extr_izq,fal_extr,extr_der,del_centro
    }

    public futbolista(int numero,String sitio,String nombre,String equipo){
        this.numero=numero;
        this.sitio=sitio;
        this.nombre=nombre;
        this.equipo=equipo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getEquipo() {
        return equipo;
    }

    public void setEquipo(String equipo) {
        this.equipo = equipo;
    }

    @Override
    public String toString() {
        return "Futbolista"+numero+", "+nombre+", "+equipo;
    }
}
