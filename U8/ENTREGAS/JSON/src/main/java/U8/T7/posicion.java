package U8.T7;

public class posicion {
      private String posicion;
      private Integer id;

      public posicion(String posicion){
          this.posicion=posicion;
      }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Posición:"+posicion;
    }
}
