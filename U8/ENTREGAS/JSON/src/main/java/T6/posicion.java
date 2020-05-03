package T6;

import java.util.ArrayList;

public class posicion {
      private String posicion;

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
