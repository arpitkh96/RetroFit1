package com.example.arpitkh996.retrofit.activites;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.arpitkh996.retrofit.B2C;
import com.example.arpitkh996.retrofit.R;
import com.example.arpitkh996.retrofit.adapters.MainRecyclerAdapter;
import com.example.arpitkh996.retrofit.interfaces.retrofit.GetCenters;
import com.example.arpitkh996.retrofit.model.ApiError;
import com.example.arpitkh996.retrofit.model.Center;
import com.example.arpitkh996.retrofit.model.Example;
import com.example.arpitkh996.retrofit.utils.ErrorHandler;
import com.google.gson.Gson;

import java.util.HashMap;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends BaseActivity implements Callback<Example> {

    Toolbar toolbar;
    MainRecyclerAdapter mainRecyclerAdapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.drawer_layout);
        toolbar=(Toolbar)findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar,R.string.app_name,R.string.app_name);
        drawer.addDrawerListener(toggle);
        toggle.syncState();
        LinearLayoutManager linearLayoutManager=new LinearLayoutManager(this);
        recyclerView=(RecyclerView)findViewById(R.id.str);
        recyclerView.setLayoutManager(linearLayoutManager);
        callApi();
    }

    @Override
    public void onResponse(Call<Example> call, Response<Example> response) {
        if (response.isSuccessful()) {
            Example example = response.body();
            if(example!=null){
                List<Center> centers=example.getData().getCenters();
                mainRecyclerAdapter=new MainRecyclerAdapter(centers,HomeActivity.this);
                recyclerView.setAdapter(mainRecyclerAdapter);
            }
            // use response data and do some fancy stuff :)
        } else {
            // parse the response body …
            ApiError error = ErrorHandler.parseError(response);
            // … and use it to show error information

            // … or just log the issue like we’re doing :)
            Log.d("error message", error.message());
        }

        hideDialog();
    }

    @Override
    public void onFailure(Call<Example> call, Throwable t) {
        hideDialog();
    }
    void callApi(){
        GetCenters getCenters = B2C.getRetrofitInstance().create(GetCenters.class);
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("start","0");
        map.put("city_id","1");
        map.put("device_width","1080");
        map.put("date","21/04/2016");
        map.put("range","0");
        map.put("cat_id","1");
        map.put("platform","android");
        map.put("app_version","12");
        map.put("category_alias","gym");
        map.put("device_id","fit_4536d8a07729c382");
        map.put("device_model","BLACK-1X");
        map.put("os_version","Android SDK, 22 (5.1)");
        map.put("latlng","28.7108748,77.1149768");
        map.put("registration_id","5605038b83215c87136a7895791cc56d3c74e854hytJqheH9911502888");
        Gson gson = new Gson();
        String json = gson.toJson(map);
        Call<Example> call = getCenters.loadCenters(map);
        call.enqueue(this);
        showDialog();
    }
}
