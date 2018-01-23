package com.fjnu.zjf.movie.utils;


import android.content.Context;

/**
 * Created by Administrator on 2017/2/6 0006.
 */

public class DensityUtil {

    private float scale;

    private float scaledDensity;

    public DensityUtil(Context mContext) {
        scale = mContext.getResources().getDisplayMetrics().density;
        scaledDensity = mContext.getResources().getDisplayMetrics().scaledDensity;
    }

    /**
     * dp转成px
     *
     * @param dipValue
     * @return
     */
    public int dip2px(float dipValue) {
        return (int) (dipValue * scale + 0.5f);
    }

    /**
     * px转成dp
     *
     * @param pxValue
     * @return
     */
    public int px2dip(float pxValue) {
        return (int) (pxValue / scale + 0.5f);
    }

}
