package com.fjnu.zjf.movie.activities;

import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.adapters.DetailViewPagerAdapter;
import com.gigamole.library.navigationtabstrip.NavigationTabStrip;

public class MovieDetailActivity extends AppCompatActivity {
    private ViewPager viewPager;
    private NavigationTabStrip tabStrip;
    private Toolbar toolbar;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_movie_detail);
        if(getSupportActionBar()!=null) getSupportActionBar().hide();
        toolbar= (Toolbar) findViewById(R.id.toolbar);
        viewPager= (ViewPager) findViewById(R.id.pager);
        tabStrip= (NavigationTabStrip) findViewById(R.id.tab_strip);
        viewPager.setAdapter(new DetailViewPagerAdapter(getSupportFragmentManager()));
        viewPager.setOffscreenPageLimit(4);
        tabStrip.setViewPager(viewPager);
    }

}
