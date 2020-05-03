package T5;

import com.google.gson.Gson;

import java.util.ArrayList;

public class main {
  public static void main(String[] args) {
      //
      ArrayList<String> posicion = new ArrayList<String>();
      posicion.add("Portero");
      posicion.add("Lateral derecho");
      posicion.add("Lateral derecho, medio centro");
      posicion.add("Medio centro");
      posicion.add("Central");
      posicion.add("Lateral izquierdo");
      posicion.add("Defensa mediocampo");
      posicion.add("Defensa mediocampo, mediocampo");
      posicion.add("Mediocampo");
      posicion.add("Extremo izquierdo");
      posicion.add("Extremo izquierdo, falso extremo");
      posicion.add("Falso extremo");
      posicion.add("Extremo derecho");
      posicion.add("Extremo derecho, mediocampo");
      posicion.add("Delantero centro");
      System.out.println(posicion);

    //
    futbolista f1 = new futbolista(1,0,"Casillas","Real Madrid");
    futbolista f2 = new futbolista(15,1,"Ramos","Real Madrid");
    futbolista f3 = new futbolista(3,4,"Pique","FC Barcelona");
    futbolista f4 = new futbolista(5,4,"Puyol","FC Barcelona");
    futbolista f5 = new futbolista(11,5,"Capdevila","Villareal");
    futbolista f6 = new futbolista(14,6,"Xabi Alonso","Real Madrid");
    futbolista f7 = new futbolista(16,6,"Busquets","FC Barcelona");
    futbolista f8 = new futbolista(8,8,"Xabi Hernandez","FC Barcelona");
    futbolista f9 = new futbolista(18,10,"Pedrito","FC Barcelona");
    futbolista f10 = new futbolista(6,13,"Iniesta","FC Barcelona");
    futbolista f11 = new futbolista(7,14,"Villa","FC Barcelona");

    Gson gson = new Gson();
    System.out.println(gson.toJson(f1));
    System.out.println(gson.toJson(f2));
    System.out.println(gson.toJson(f3));
    System.out.println(gson.toJson(f4));
    System.out.println(gson.toJson(f5));
    System.out.println(gson.toJson(f6));
    System.out.println(gson.toJson(f7));
    System.out.println(gson.toJson(f8));
    System.out.println(gson.toJson(f9));
    System.out.println(gson.toJson(f10));
    System.out.println(gson.toJson(f11));
  }
}
