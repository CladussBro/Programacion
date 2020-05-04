package T6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;

public class principal {
  public static void main(String[] args){

    ArrayList<futbolista> futbolistas = new ArrayList<futbolista>();
    futbolista f1 = new futbolista(1, "Casillas", new ArrayList<>(Arrays.asList("Portero")) , "Real Madrid");
    futbolista f2 = new futbolista(15, "Ramos", new ArrayList<>(Arrays.asList("Lateral derecho", "Medio centro")), "Real Madrid");
    futbolista f3 = new futbolista(3, "Pique", new ArrayList<>(Arrays.asList("Central")), "FC Barcelona");
    futbolista f4 = new futbolista(5, "Puyol", new ArrayList<>(Arrays.asList("Central")), "FC Barcelona");
    futbolista f5 = new futbolista(11, "Capdevila",new ArrayList<>(Arrays.asList("Lateral izquierdo")), "Villareal");
    futbolista f6 = new futbolista(14, "Xabi Alonso", new ArrayList<>(Arrays.asList("Defensa mediocampo")), "Real Madrid");
    futbolista f7 = new futbolista(16, "Busquets",new ArrayList<>(Arrays.asList("Defensa Mediocampo")), "FC Barcelona");
    futbolista f8 = new futbolista(8, "Xavi Hernandez",new ArrayList<>(Arrays.asList("Extremo izquierdo", "Falso extremo")), "FC Barcelona");
    futbolista f9 = new futbolista(18, "Pedrito", new ArrayList<>(Arrays.asList("Extremo izquierdo", "Falso extremo")), "FC Barcelona");
    futbolista f10 = new futbolista(6, "Iniesta",new ArrayList<>(Arrays.asList("Extremo derecho", "Mediocampo")) , "FC Barcelona");
    futbolista f11 = new futbolista(7, "Villa",new ArrayList<>(Arrays.asList("Delantero centro")), "FC Barcelona");

    futbolistas.add(f1);
    futbolistas.add(f2);
    futbolistas.add(f3);
    futbolistas.add(f4);
    futbolistas.add(f5);
    futbolistas.add(f6);
    futbolistas.add(f7);
    futbolistas.add(f8);
    futbolistas.add(f9);
    futbolistas.add(f10);
    futbolistas.add(f11);

    Gson gson = new Gson();

    String jsonString;

    System.out.println(jsonString = gson.toJson(futbolistas));

    Type typelist =new TypeToken<ArrayList<futbolista>>(){}.getType();

    ArrayList<futbolista> arrayfutbolista = gson.fromJson(jsonString,typelist);
    ArrayList<String> ramos = new ArrayList<>();

    Iterator it = arrayfutbolista.iterator();

    while (it.hasNext()){
      futbolista jugador = (futbolista) it.next();
      if (jugador.getNombre().equals("Ramos")){
        Iterator it2 = jugador.getPosi().iterator();
        while (it2.hasNext()){
          ramos.add((String) it2.next());
        }
      }

    }
    System.out.println("Posiciones posibles de Ramos: "+ramos);
  }
}
