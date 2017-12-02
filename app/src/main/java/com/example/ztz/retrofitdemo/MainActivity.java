package com.example.ztz.retrofitdemo;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

import com.example.ztz.retrofitdemo.bean.DataBeans;
import com.example.ztz.retrofitdemo.presenter.RequestPresenter;
import com.example.ztz.retrofitdemo.view.ViewCallBack;

public class MainActivity extends AppCompatActivity implements ViewCallBack{

    private RequestPresenter presenter;
    private String tag = "-------------";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        presenter = new RequestPresenter(this);
        presenter.getData();
    }

    @Override
    public void Sueess(DataBeans dataBeans) {
        //Log.i(tag, "Sueess: "+dataBeans.getNewslist().get(1).getTitle());
        Log.i(tag, "Sueess: "+dataBeans.getData().getName().toString());
    }

    @Override
    public void Failure(String e) {
        Log.i(tag, "Failure: "+e);
    }
}
