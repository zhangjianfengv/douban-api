package com.fjnu.zjf.movie.adapters;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import com.fjnu.zjf.movie.CommentsFragment;
import com.fjnu.zjf.movie.ImagesFragment;
import com.fjnu.zjf.movie.IntroductionFragment;
import com.fjnu.zjf.movie.ReviewsFragment;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by z on 2016/10/26.
 */
public class DetailViewPagerAdapter extends FragmentStatePagerAdapter {
    private List<Fragment> mFragments = new ArrayList<>();
    public DetailViewPagerAdapter(FragmentManager fm) {
        super(fm);
        mFragments.add(new IntroductionFragment());
        mFragments.add(new ImagesFragment());
        mFragments.add(new CommentsFragment());
        mFragments.add(new ReviewsFragment());
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
