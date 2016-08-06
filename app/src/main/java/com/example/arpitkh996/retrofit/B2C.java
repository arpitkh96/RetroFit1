package com.example.arpitkh996.retrofit;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.arpitkh996.retrofit.utils.URL_API.BASE_URL;

/**
 * Created by arpitkh996 on 04-08-2016.
 */

public class B2C extends Application {
    static Retrofit retrofit;
    static Gson gson;
    @Override
    public void onCreate() {
        super.onCreate();
        gson=new GsonBuilder().setLenient().create();
         retrofit= new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .build();
    }
    public  static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            gson=new GsonBuilder().setLenient().create();
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create(gson))
                    .build();
        }
        return retrofit;
    }

}
