package com.example.farm_manager;

import java.util.List;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;

public interface Api {
    String BASE_URL = "https://testapi.io/api/thomasjgx/farmers";
    @GET("todos")
    Call<List<Todo>> getTodos();

    @GET("todos/{id}")
    Call<ObjectResponse<Todo>> getTodo(@Path("id") int id);


}
