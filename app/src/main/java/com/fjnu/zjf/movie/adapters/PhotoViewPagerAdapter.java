package com.fjnu.zjf.movie.adapters;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.fjnu.zjf.movie.PhotoPagerFragment;
import com.fjnu.zjf.movie.beans.Images;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z on 2016/10/26.
 */
public class PhotoViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Images.PhotosBean> list;
    public PhotoViewPagerAdapter(FragmentManager fm, List<Images.PhotosBean> list) {
        super(fm);
        this.list=list;
    }

    @Override
    public Fragment getItem(int position) {
        PhotoPagerFragment fragment=new PhotoPagerFragment();
        Bundle bundle=new Bundle();
        bundle.putString("url",list.get(position).getImage());
        fragment.setArguments(bundle);
        return fragment ;
    }

    @Override
    public int getCount() {
        return list.size();
    }
}
