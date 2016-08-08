package com.example.arpitkh996.retrofit;

import android.app.Application;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

import static com.example.arpitkh996.retrofit.utils.URL_API.BASE_URL;

/**
 * Created by arpitkh996 on 04-08-2016.
 */

public class B2C extends Application {
    static Retrofit retrofit;
    static OkHttpClient client;
    @Override
    public void onCreate() {
        super.onCreate();
        getRetrofitInstance();
    }
    public  static Retrofit getRetrofitInstance(){
        if(retrofit==null){
            HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
            interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
            client = new OkHttpClient.Builder().addInterceptor(interceptor).build();
            retrofit= new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .client(client)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }
        return retrofit;
    }

}
