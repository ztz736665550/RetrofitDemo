package com.example.ztz.retrofitdemo.view;

import com.example.ztz.retrofitdemo.bean.DataBeans;

/**
 * Created by ztz on 2017/12/1.
 */

public interface ViewCallBack {
    public void Sueess(DataBeans dataBeans);
    public void Failure(String e);
}
