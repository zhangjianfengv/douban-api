package com.fjnu.zjf.movie;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fjnu.zjf.movie.activities.PhotoActivity;
import com.fjnu.zjf.movie.adapters.ImagesAdapter;
import com.fjnu.zjf.movie.beans.Images;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class ImagesFragment extends BaseFragment {
    @BindView(R.id.grid_image)
    GridView gridImage;
    private Gson gson;
    private String url = "https://api.douban.com/v2/movie/subject/26683290/photos?count=100&udid=f280acb2c8c0fb9c55b2ecdc9fb88a2b59b6d9e4&client=s%3Amobile%7Cy%3AAndroid+4.2.2%7Co%3AG3812ZNUANF1%7Cf%3A73%7Cv%3A2.7.7%7Cm%3ADoubanTest%7Cd%3A358180054335623%7Ce%3Asamsung+wilcoxds%7Css%3A540x960&apikey=0b2bdeda43b5688921839c8ecb20399b";

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_images, container, false);
        ButterKnife.bind(this, view);
        RequestQueue queue= ThisApp.queue;
        String id=mActivity.getIntent().getStringExtra("id");
        gson=ThisApp.gson;
        StringRequest request=new StringRequest(url.replace("26683290",id), new Response.Listener<String>() {
            @Override
            public void onResponse(final String s) {
                Images images=gson.fromJson(s,Images.class);
                gridImage.setAdapter(new ImagesAdapter(images.getPhotos(),mActivity));
                gridImage.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent=new Intent(mActivity, PhotoActivity.class);
                        intent.putExtra("jsonstring",s);
                        intent.putExtra("position",position);
                        startActivity(intent);
                    }
                });
            }
        },null);
        queue.add(request);
        return view;
    }

}
