package com.fjnu.zjf.movie.utils;

import java.util.List;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class StringUtil {
    public static String divideString(List<String> list) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) sb.append("/");
        }
        return sb.toString();
    }

    public static String divideStringByComma(List<String> list) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < list.size(); i++) {
            sb.append(list.get(i));
            if (i != list.size() - 1) sb.append(",");
        }
        return sb.toString();
    }
}
