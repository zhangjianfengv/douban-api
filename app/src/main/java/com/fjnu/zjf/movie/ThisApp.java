package com.fjnu.zjf.movie;

import android.app.Application;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.Volley;
import com.google.gson.Gson;

/**
 * Created by Administrator on 2017/1/29 0029.
 */

public class ThisApp extends Application {
    public static Gson gson;
    public static RequestQueue queue;
    @Override
    public void onCreate() {
        super.onCreate();
        gson=new Gson();
        queue= Volley.newRequestQueue(getApplicationContext());
    }
}
