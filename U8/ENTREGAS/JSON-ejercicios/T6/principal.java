package T6;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

import java.lang.reflect.Type;
import java.util.ArrayList;

public class principal {
  public static void main(String[] args){

    futbolista f1 = new futbolista(1,"Casillas","Real Madrid");
    futbolista f2 = new futbolista(15,"Ramos","Real Madrid");
    futbolista f3 = new futbolista(3,"Pique","FC Barcelona");
    futbolista f4 = new futbolista(5,"Puyol","FC Barcelona");
    futbolista f5 = new futbolista(11,"Capdevila","Villareal");
    futbolista f6 = new futbolista(14,"Xabi Alonso","Real Madrid");
    futbolista f7 = new futbolista(16,"Busquets","FC Barcelona");
    futbolista f8 = new futbolista(8,"Xabi Hernandez","FC Barcelona");
    futbolista f9 = new futbolista(18,"Pedrito","FC Barcelona");
    futbolista f10 = new futbolista(6,"Iniesta","FC Barcelona");
    futbolista f11 = new futbolista(7,"Villa","FC Barcelona");

    Gson gson = new Gson();
    System.out.println(gson.toJson(f2));

    posicion p1 = new posicion("Portero");
    posicion p2 = new posicion("Lateral derecho, medio centro");
    posicion p3 = new posicion("Medio centro");
    posicion p4 = new posicion("Central");
    posicion p5 = new posicion("Lateral izquierdo");
    posicion p6 = new posicion("Defensa mediocampo");
    posicion p7 = new posicion("Defensa mediocampo, mediocampo");
    posicion p8 = new posicion("Mediocampo");
    posicion p9 = new posicion("Extremo izquierdo, falso extremo");
    posicion p10 = new posicion("Extremo derecho, mediocampo");
    posicion p11 = new posicion("Delantero centro");

    ArrayList<posicion> posi = new ArrayList<>();
    posi.add(p1);
    posi.add(p2);
    posi.add(p3);
    posi.add(p4);
    posi.add(p5);
    posi.add(p6);
    posi.add(p7);
    posi.add(p8);
    posi.add(p9);
    posi.add(p10);
    posi.add(p11);

    f2.setPosi(posi);
    System.out.println(gson.toJson(f2));

    String json_completo = gson.toJson(f2);
    futbolista nuevo_f2 = gson.fromJson(json_completo,futbolista.class);
    System.out.println(nuevo_f2);

    String json_array = gson.toJson(f2);

    Type listType = new TypeToken<ArrayList<posicion>>(){}.getType();
    ArrayList<posicion> array_de_json = gson.fromJson(json_array, listType);

    System.out.println(array_de_json);
  }
}
