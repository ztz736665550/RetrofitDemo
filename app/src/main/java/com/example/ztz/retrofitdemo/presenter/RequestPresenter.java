package com.example.ztz.retrofitdemo.presenter;

import com.example.ztz.retrofitdemo.bean.DataBeans;
import com.example.ztz.retrofitdemo.model.ModelCallBack;
import com.example.ztz.retrofitdemo.model.RequestModel;
import com.example.ztz.retrofitdemo.view.ViewCallBack;

/**
 * Created by ztz on 2017/12/1.
 */

public class RequestPresenter {

    private ViewCallBack viewCallBack;
    private final RequestModel model;

    public RequestPresenter(ViewCallBack viewCallBack) {
        this.viewCallBack = viewCallBack;
        this.model = new RequestModel();
    }

    public void getData() {
        model.getData(new ModelCallBack() {
            @Override
            public void Sueess(DataBeans dataBeans) {
                viewCallBack.Sueess(dataBeans);
            }

            @Override
            public void Failure(String e) {
                viewCallBack.Failure(e);
            }
        });
    }
}
