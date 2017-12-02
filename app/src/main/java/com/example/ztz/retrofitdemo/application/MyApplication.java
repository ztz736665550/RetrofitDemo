package com.example.ztz.retrofitdemo.application;

import android.app.Application;

import com.example.ztz.retrofitdemo.bean.DataBeans;
import com.example.ztz.retrofitdemo.model.Api;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by ztz on 2017/12/1.
 */

public class MyApplication extends Application {

    public static Api mApi;
    //第一个接口可以get请求
    //第二个接口可以get和post请求
    //http://api.tianapi.com/wxnew/?key=18e883dd6b316eb1d97fd86338abbf06&num=10
    //https://www.zhaoapi.cn/user/getDefaultAddr?uid=71
    @Override
    public void onCreate() {
        super.onCreate();
        Retrofit retrofit = new Retrofit.Builder()
                //.baseUrl("http://api.tianapi.com/")
                .baseUrl("https://www.zhaoapi.cn/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        mApi = retrofit.create(Api.class);
    }
}
