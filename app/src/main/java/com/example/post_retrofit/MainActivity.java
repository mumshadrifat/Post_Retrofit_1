package com.example.post_retrofit;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

import com.google.gson.Gson;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Retrofit retrofit =new Retrofit
                .Builder()
                .baseUrl("https://app.fakejson.com/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();
        OurRetrofitClient ourClient =retrofit.create(OurRetrofitClient.class);
        Last_login last_login = new Last_login("01/01/2001","ip4");
        PostClass post=new PostClass("222","email@gmail.com","male",last_login);
        ObjectCLass obj=new ObjectCLass("FsvDULTazYLKzjum7a19qQ",post);

        Call<ResponseClass>responseClassCall=ourClient.GetPostValue(obj);
        responseClassCall.enqueue(new Callback<ResponseClass>() {
            @Override
            public void onResponse(Call<ResponseClass> call, Response<ResponseClass> response) {
                System.out.println("yo");

                Log.d("tag," ,"onResponse: kkkk");
                int res_code=response.code();
                Log.d("tag," ,response.body().getEmail());
                String reponse_code=String.valueOf(res_code);
                Toast.makeText(MainActivity.this, reponse_code, Toast.LENGTH_SHORT).show();

            }

            @Override
            public void onFailure(Call<ResponseClass> call, Throwable t) {
                Log.d("tag," ,"failed: kkkk");




            }
        });

    }
}