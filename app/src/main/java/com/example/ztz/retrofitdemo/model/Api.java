package com.example.ztz.retrofitdemo.model;


import com.example.ztz.retrofitdemo.bean.DataBeans;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.GET;
import retrofit2.http.POST;
import retrofit2.http.Query;

/**
 * Created by ztz on 2017/12/1.
 */

public interface Api {
    /**
     * get请求
     * @param key
     * @param num
     * @return
     */
    @GET("wxnew")
    Call<DataBeans> get(@Query("key") String key ,@Query("num") String num);

    /**
     * post请求 --- post请求需要表单提交@FormUrlEncoded
     * @param key
     * @param num
     * @return
     */
    @FormUrlEncoded
    @POST("user/getDefaultAddr")
    Call<DataBeans> post(@Field("uid") String uid );
}
