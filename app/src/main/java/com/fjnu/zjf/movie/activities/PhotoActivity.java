package com.fjnu.zjf.movie.activities;

import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AppCompatActivity;
import android.view.MotionEvent;

import com.fjnu.zjf.movie.PhotoPagerFragment;
import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.adapters.PhotoViewPagerAdapter;
import com.fjnu.zjf.movie.beans.Images;
import com.google.gson.Gson;

import java.util.ArrayList;

import butterknife.BindView;
import butterknife.ButterKnife;

public class PhotoActivity extends AppCompatActivity {

    @BindView(R.id.pager)
    ViewPager pager;
    private Gson gson;
    private ArrayList<MyTouchListener> myTouchListeners = new ArrayList<>();
    private PhotoViewPagerAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_photo);
        ButterKnife.bind(this);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        gson = new Gson();
        String json = getIntent().getStringExtra("jsonstring");
        int position = getIntent().getIntExtra("position", 0);
        adapter=new PhotoViewPagerAdapter(getSupportFragmentManager(), gson.fromJson(json, Images.class).getPhotos());
        pager.setAdapter(adapter);
        pager.setCurrentItem(position);
    }

    public void registerMyTouchListener(MyTouchListener listener) {
        myTouchListeners.add(listener);
    }

    public void unRegisterMyTouchListener(MyTouchListener listener) {
        myTouchListeners.remove(listener);
    }

    @Override
    public boolean dispatchTouchEvent(MotionEvent ev) {
        for (MyTouchListener listener : myTouchListeners) {
            listener.onTouchEvent(ev);
        }
        return super.dispatchTouchEvent(ev);
    }

    public interface MyTouchListener {
        void onTouchEvent(MotionEvent event);
    }
}
