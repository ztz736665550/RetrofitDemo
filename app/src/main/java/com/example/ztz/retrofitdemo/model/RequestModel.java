package com.example.ztz.retrofitdemo.model;


import android.util.Log;

import com.example.ztz.retrofitdemo.application.MyApplication;
import com.example.ztz.retrofitdemo.bean.DataBeans;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by ztz on 2017/12/1.
 */

public class RequestModel {
    /**
     * get请求
     * @param modelCallBack
     */
    public void getData(final ModelCallBack modelCallBack){
        //Call<DataBeans> call = MyApplication.mApi.get("18e883dd6b316eb1d97fd86338abbf06","10");
        Call<DataBeans> call = MyApplication.mApi.post("71");

        call.enqueue(new Callback<DataBeans>() {

            private String TAG = "------------";

            @Override
            public void onResponse(Call<DataBeans> call, Response<DataBeans> response) {
                DataBeans body = response.body();
                Log.i(TAG, "onResponse: "+body.getData().getName().toString());
                modelCallBack.Sueess(body);
            }

            @Override
            public void onFailure(Call<DataBeans> call, Throwable t) {
                String s = t.toString();
                Log.i(TAG, "onFailure: "+s);
                modelCallBack.Failure(s);
            }
        });
    }

}
