import com.google.gson.Gson;

public class MAIN {
  public static void main(String[] args) {
    //
    System.out.println("Hola");
    // Serialization
    BagOfPrimitives obj = new BagOfPrimitives();
    Gson gson = new Gson();
    String json = gson.toJson(obj);

    System.out.println(json);

// ==> json is {"value1":1,"value2":"abc"}
  }
}
