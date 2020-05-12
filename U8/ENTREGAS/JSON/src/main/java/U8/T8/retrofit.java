package U8.T8;

import com.google.gson.Gson;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class retrofit {
  public static void main(String[] args) {
      ArrayList<alumnos> alumno = new ArrayList<alumnos>();
      alumnos a1 = new alumnos(1,"Fernando","García",20, new ArrayList<>(Arrays.asList("1,Programación,1","2,Base de datos,1")));
      alumnos a2 = new alumnos(2,"Manuel","Sánchez",23,new ArrayList<>(Arrays.asList("3,Programación,2","4,Lenguaje de Marcas,2")));
      alumno.add(a1);
      alumno.add(a2);
      Gson gson = new Gson();
      String jsonString;
      System.out.println(jsonString = gson.toJson(alumno));

    //
      Retrofit retrofit = new Retrofit.Builder()
              .baseUrl("https://my-json-server.typicode.com/chemaduran/json_entrega1/")
              .addConverterFactory(GsonConverterFactory.create())
              .build();


      CentralAlumnos service = retrofit.create(CentralAlumnos.class);
      alumnos alum=null;
      final Integer alumnoId=2;

    System.out.println("Obtenemos una lista de los alumnos");
    try{
        Response<List<alumnos>> response = service.listAlumnos().execute();
        if(response.isSuccessful()){
            List<alumnos> alumnos =response.body();
        System.out.println(alumnos);
        }
    }catch(IOException e){
      System.out.println("Error en la petición "+e.getMessage());
    }


    System.out.println("Obtenemos un alumno concreto identificado por su id, "+alumnoId);
      try{
          Response<alumnos> response = service.getalumnoId(alumnoId).execute();
          if (response.isSuccessful()){
              alum = response.body();
              System.out.println(alum);
          }else{
              System.out.println("Petición no válida: "+response.message());
          }
      }catch(IOException e){
          System.out.println("Error en la petición: "+e.getMessage());
      }


      System.out.println("Obtenemos las asignaturas de un alumno concreto identificado por su id, "+alumnoId);
      try{
          Response<List<asignaturas>> response = service.listAlumnosasignaturas(alumnoId).execute();
          if (response.isSuccessful()){
              List<asignaturas> asign = response.body();
              System.out.println(asign);
              if (alum!=null){
                  alum.setAsignatura(new ArrayList<>(asign));
              }
          }else{
              System.out.println("Petición no válida: "+response.message());
          }
      }catch(IOException e){
          System.out.println("Error en la petición: "+e.getMessage());
      }


    System.out.println();
    System.out.println("Imprimimos el objeto alumno:");
    System.out.println(alum);
  }
}
