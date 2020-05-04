package T7;

import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.List;

public class principal_retrofit {
  public static void main(String[] args) {
    //
      Retrofit retrofit = new Retrofit.Builder()
              .baseUrl("https://my-json-server.typicode.com/chemaduran/futbolistas_api_demo/")
              .addConverterFactory(GsonConverterFactory.create())
              .build();

      CentralFutbolistas service = retrofit.create(CentralFutbolistas.class);
      futbolista fut=null;
      final Integer FutbolistaId=2;
      System.out.println("Obtenemos un futbolista concreto identificado por su id, "+FutbolistaId);
    try{
      Response<futbolista> response = service.getFutbolistaId(FutbolistaId).execute();
        if (response.isSuccessful()){
            fut = response.body();
        System.out.println(fut);
        }else{
        System.out.println("Petición no válida: "+response.message());
        }
    }catch(IOException e){
      System.out.println("Error en la petición: "+e.getMessage());
    }
    }
}
