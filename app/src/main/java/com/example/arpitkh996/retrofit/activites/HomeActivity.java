package com.example.arpitkh996.retrofit.activites;

import android.os.Bundle;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.support.v7.widget.Toolbar;
import android.util.Log;

import com.example.arpitkh996.retrofit.B2C;
import com.example.arpitkh996.retrofit.adapters.MainRecyclerAdapter;
import com.example.arpitkh996.retrofit.interfaces.retrofit.GetCenters;
import com.example.arpitkh996.retrofit.model.ApiError;
import com.example.arpitkh996.retrofit.model.SimpleResponse;
import com.example.arpitkh996.retrofit.model.T3VO;
import com.example.arpitkh996.retrofit.utils.ErrorHandler;
import com.simpleResponse.arpitkh996.retrofit.R;

import java.util.HashMap;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class HomeActivity extends BaseActivity implements Callback<T3VO> {

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
    public void onResponse(Call<T3VO> call, Response<T3VO> response) {
        if (response.isSuccessful()) {
            T3VO simpleResponse =response.body();
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
    public void onFailure(Call<T3VO> call, Throwable t) {
        hideDialog();
    }
    void callApi(){
        GetCenters getCenters = B2C.getRetrofitInstance().create(GetCenters.class);
        HashMap<String,String> map=new HashMap<String,String>();
        map.put("deviceid","88a55f98eb2b90b1");
        map.put("rid","6");
        map.put("userid","cafman5388");
        map.put("av","1.0");
        Call<T3VO> call = getCenters.loadCenters(map);
        call.enqueue(this);
        showDialog();
    }
}
