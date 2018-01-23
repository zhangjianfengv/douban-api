package com.fjnu.zjf.movie.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.fjnu.zjf.movie.CollectionListFragment;
import com.fjnu.zjf.movie.MoreFragment;
import com.fjnu.zjf.movie.TheaterFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z on 2016/10/26.
 */
public class MainViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments = new ArrayList<>();
    public MainViewPagerAdapter(FragmentManager fm) {
        super(fm);
        TheaterFragment theater=new TheaterFragment();
        CollectionListFragment classic=new CollectionListFragment();
        MoreFragment mine=new MoreFragment();
        mFragments.add(theater);
        mFragments.add(classic);
        mFragments.add(mine);
    }

    @Override
    public Fragment getItem(int position) {
        return mFragments.get(position);
    }

    @Override
    public int getCount() {
        return mFragments.size();
    }
}
