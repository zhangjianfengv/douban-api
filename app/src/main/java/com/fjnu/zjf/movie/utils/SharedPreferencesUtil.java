package com.fjnu.zjf.movie.utils;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by Administrator on 2017/2/5 0005.
 */

public class SharedPreferencesUtil {

    public static SharedPreferences.Editor getEditor(Context context){
        return context.getSharedPreferences("movie", Context.MODE_PRIVATE).edit();
    }

    public static SharedPreferences getSharedPreferences(Context context){
        return context.getSharedPreferences("movie", Context.MODE_PRIVATE);
    }
}
