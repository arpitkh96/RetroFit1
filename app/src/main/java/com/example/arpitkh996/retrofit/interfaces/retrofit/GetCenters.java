package com.example.arpitkh996.retrofit.interfaces.retrofit;

import com.example.arpitkh996.retrofit.model.Example;


import java.util.HashMap;
import java.util.Map;

import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by arpitkh996 on 04-08-2016.
 */

public interface GetCenters {
    @FormUrlEncoded
    @POST("customer/getCenters")
    Call<Example> loadCenters(@FieldMap HashMap<String,String> data);
}
