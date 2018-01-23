package com.fjnu.zjf.movie;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.fjnu.zjf.movie.adapters.ComingSoonAdapter;
import com.fjnu.zjf.movie.adapters.TheaterAdapter;
import com.fjnu.zjf.movie.beans.ComingSoon;
import com.fjnu.zjf.movie.beans.Theater;
import com.fjnu.zjf.movie.utils.Listener;
import com.fjnu.zjf.movie.utils.VolleyUtil;
import com.fjnu.zjf.movie.widgets.AppendableGridView;
import com.google.gson.Gson;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class TheaterFragment extends BaseFragment {
    @BindView(R.id.pro_bar)
    ProgressBar proBar;
    @BindView(R.id.grid_theater)
    AppendableGridView gridTheater;
    @BindView(R.id.tv_more)
    TextView tvMore;
    @BindView(R.id.pro_bar_more)
    ProgressBar proBarMore;
    @BindView(R.id.layout_more)
    LinearLayout layoutMore;
    @BindView(R.id.grid_coming_soon)
    AppendableGridView gridComingSoon;
    private Gson gson;
    private boolean finish = false;
    //private String inTheaterUrl = "https://api.douban.com/v2/movie/in_theaters?count=100";
    //private String comingSoonUrl = "https://api.douban.com/v2/movie/coming_soon?count=20&udid=f280acb2c8c0fb9c55b2ecdc9fb88a2b59b6d9e4&start=0&client=s%3Amobile%7Cy%3AAndroid+4.2.2%7Co%3AG3812ZNUANF1%7Cf%3A73%7Cv%3A2.7.7%7Cm%3ADoubanTest%7Cd%3A358180054335623%7Ce%3Asamsung+wilcoxds%7Css%3A540x960&apikey=0b2bdeda43b5688921839c8ecb20399b&city=%E5%8C%97%E4%BA%AC";
    private String inTheaterUrl = "https://frodo.douban.com/api/v2/subject_collection/movie_showing/subjects?count=100&loc_id=118200&os_rom=miui6&apikey=0b2bdeda43b5688921839c8ecb20399b&channel=Xiaomi_Market&udid=034f7bc5b81ce8459523bdb6ee78aff7a007f321&_sig=4jWde/fgieiLrydyw0rHzet3pjg%3D&_ts=1497346351";
    private String comingSoonUrl = "https://frodo.douban.com/api/v2/subject_collection/movie_soon/subjects?count=100&loc_id=118200&os_rom=miui6&apikey=0b2bdeda43b5688921839c8ecb20399b&channel=Xiaomi_Market&udid=034f7bc5b81ce8459523bdb6ee78aff7a007f321&_sig=4AJYoc6yFEM2UJps/D7x2qjlPsg%3D&_ts=1497346526";
    private RequestQueue queue;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_theater, container, false);
        gson = ThisApp.gson;
        queue = ThisApp.queue;
        ButterKnife.bind(this, rootView);
        StringRequest[] request = new StringRequest[2];
        request[0] = new StringRequest(inTheaterUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                proBar.setVisibility(View.GONE);
                Theater theater = gson.fromJson(s, Theater.class);
                List<Theater.SubjectsBean> list = theater.getSubjects();
                gridTheater.setAdapter(new TheaterAdapter(list, mActivity));
                final List<String> idList = new ArrayList<>();
                for (Theater.SubjectsBean bean : list) {
                    idList.add(bean.getId());
                }
                gridTheater.setOnItemClickListener(Listener.getOnItemClickListener(mActivity, idList));
                layoutMore.setVisibility(View.VISIBLE);
            }
        }, null){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return VolleyUtil.getFrodoHeaders();
            }
        };
        request[1] = new StringRequest(comingSoonUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                finish = true;
                proBarMore.setVisibility(View.GONE);
                ComingSoon comingSoon = gson.fromJson(s, ComingSoon.class);
                List<ComingSoon.SubjectsBean> list = comingSoon.getSubjects();
                gridComingSoon.setAdapter(new ComingSoonAdapter(list, mActivity));
                final List<String> idList = new ArrayList<>();
                for (ComingSoon.SubjectsBean bean : list) {
                    idList.add(bean.getId());
                }
                gridComingSoon.setOnItemClickListener(Listener.getOnItemClickListener(mActivity, idList));
            }
        }, null){
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return VolleyUtil.getFrodoHeaders();
            }
        };
        layoutMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (!finish) proBarMore.setVisibility(View.VISIBLE);
                else {
                    tvMore.setText("-----------------即将上映----------------");
                    layoutMore.setBackgroundResource(R.color.main);
                }
                gridComingSoon.setVisibility(View.VISIBLE);
            }
        });
        queue.add(request[0]);
        queue.add(request[1]);
        return rootView;
    }
}
