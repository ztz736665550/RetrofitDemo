package com.example.ztz.retrofitdemo.model;

import com.example.ztz.retrofitdemo.bean.DataBeans;

/**
 * Created by ztz on 2017/12/1.
 */

public interface ModelCallBack {
    public void Sueess(DataBeans dataBeans);
    public void Failure(String e);
}
