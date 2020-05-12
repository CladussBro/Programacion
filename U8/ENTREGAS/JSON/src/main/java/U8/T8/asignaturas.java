package U8.T8;

public class asignaturas {
    private Integer id;
    private String nombre;
    private Integer alumnoid;

    public asignaturas(Integer id,String nombre,Integer alumnoid){
        this.id=id;
        this.nombre=nombre;
        this.alumnoid=alumnoid;
    }
    public Integer getId() { return id; }
    public void setId(int id) { this.id = id; }
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }
    public Integer getAlumno_id() { return alumnoid; }
    public void setAlumno_id(int alumnoid) { this.alumnoid = alumnoid; }

    @Override
    public String toString() {
        return "Id: "+id+", nombre: "+nombre+", alumno_id: "+alumnoid;
    }
}
