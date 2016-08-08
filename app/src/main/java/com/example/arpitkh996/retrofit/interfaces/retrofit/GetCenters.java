package com.example.arpitkh996.retrofit.interfaces.retrofit;

import com.example.arpitkh996.retrofit.model.SimpleResponse;
import com.example.arpitkh996.retrofit.model.T3VO;


import java.util.HashMap;

import retrofit2.Call;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

/**
 * Created by arpitkh996 on 04-08-2016.
 */

public interface GetCenters {
    @FormUrlEncoded
    @POST("table/gettableturntime")
    Call<T3VO> loadCenters(@FieldMap HashMap<String,String> data);
}
