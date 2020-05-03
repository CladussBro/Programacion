package T5;

import com.google.gson.Gson;

public class main {
  public static void main(String[] args) {
    //
    futbolista f1 = new futbolista(1,"Portero","Casillas","Real Madrid");
    futbolista f2 = new futbolista(15,"Lateral derecho, medio centro","Ramos","Real Madrid");
    futbolista f3 = new futbolista(3,"Central","Pique","FC Barcelona");
    futbolista f4 = new futbolista(5,"Central","Puyol","FC Barcelona");
    futbolista f5 = new futbolista(11,"Lateral izquierdo","Capdevila","Villareal");
    futbolista f6 = new futbolista(14,"Defensa mediocampo","Xabi Alonso","Real Madrid");
    futbolista f7 = new futbolista(16,"Defensa mediocampo","Busquets","FC Barcelona");
    futbolista f8 = new futbolista(8,"Mediocampo","Xabi Hernandez","FC Barcelona");
    futbolista f9 = new futbolista(18,"Extremo izquierdo, Falso extremo","Pedrito","FC Barcelona");
    futbolista f10 = new futbolista(6,"Extremo derecho, Mediocampo","Iniesta","FC Barcelona");
    futbolista f11 = new futbolista(7,"Delantero centro","Villa","FC Barcelona");

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
