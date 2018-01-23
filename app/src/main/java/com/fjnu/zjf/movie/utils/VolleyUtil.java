package com.fjnu.zjf.movie.utils;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/1/30 0030.
 */

public class VolleyUtil {
    public static Map<String, String> getFrodoHeaders(){
        Map<String, String> headers = new HashMap();
        headers.put("Charset", "UTF-8");
        headers.put("User-Agent", "Rexxar-Core/0.1.3 com.douban.frodo/4.10.0(89) Android/17 rom/android udid/970d71040a81eee4a06f3c5d4ff50412c45c66ce Rexxar/1.2.151");
        return headers;
    }
}
