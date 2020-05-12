package U8.T8;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralAlumnos {
    @GET("json_api_demo/alumnos")
      Call<List<alumnos>> listAlumnos();

        @GET ("json_api_demo/alumnos/{alumnoId}")
        Call<alumnos> getalumnoId(@Path("alumnoId")Integer alumnoId);


    @GET("json_api_demo/asignaturas")
    Call<List<asignaturas>>listAlumnosasignaturas(@Path("alumnoId")Integer alumnoId);
}
