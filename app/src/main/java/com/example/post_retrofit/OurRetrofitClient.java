package com.example.post_retrofit;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface OurRetrofitClient {


    @POST("q")
    Call<ResponseClass> GetPostValue(@Body ObjectCLass obj);
}
