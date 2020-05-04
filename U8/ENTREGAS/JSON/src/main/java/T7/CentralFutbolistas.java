package T7;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

import java.util.List;

public interface CentralFutbolistas {
    @GET("json_api_demo/futbolistas")
    Call<List<futbolista>> listafutbolistas();

    @GET("json_api_demo/futbolistas/{Futbolista_Id}")
    Call<futbolista> getFutbolistaId(@Path("Futbolista_Id") Integer Futbolista_Id);
}
