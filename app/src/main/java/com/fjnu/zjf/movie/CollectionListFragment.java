package com.fjnu.zjf.movie;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.RelativeLayout;
import android.widget.ScrollView;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.fjnu.zjf.movie.activities.MovieDetailActivity;
import com.fjnu.zjf.movie.adapters.BestAdapter;
import com.fjnu.zjf.movie.adapters.HighBoxOfficeAdapter;
import com.fjnu.zjf.movie.adapters.Top250Adapter;
import com.fjnu.zjf.movie.beans.Best;
import com.fjnu.zjf.movie.beans.HighBoxOffice;
import com.fjnu.zjf.movie.beans.Top250;
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
public class CollectionListFragment extends BaseFragment {

    @BindView(R.id.pro_bar)
    ProgressBar proBar;
    @BindView(R.id.grid_best)
    AppendableGridView gridBest;
    @BindView(R.id.tv_more0)
    TextView tvMore0;
    @BindView(R.id.layout_more)
    LinearLayout layoutMore;
    @BindView(R.id.grid_high_box_office)
    AppendableGridView gridHighBoxOffice;
    @BindView(R.id.tv_more1)
    TextView tvMore1;
    @BindView(R.id.layout_more1)
    LinearLayout layoutMore1;
    @BindView(R.id.grid_top250)
    AppendableGridView gridTop250;
    @BindView(R.id.pro_bar_more)
    ProgressBar proBarMore;
    @BindView(R.id.tv_more)
    TextView tvMore;
    RelativeLayout layoutFooter;
    List<Top250.SubjectCollectionItemsBean> top250List;
    Top250Adapter top250Adapter;
    @BindView(R.id.scroll_collection)
    ScrollView scrollCollection;
    private int start = 0;
    List<String> top250IdList;
    private Gson gson;
    private RequestQueue queue;
    private String bestUrl = "https://frodo.douban.com/api/v2/subject_collection/movie_best/items?start=0&count=18&_ts=1485073185&_sig=4S7dQPM1U97u90D1EzoefWfMfVQ%3D&device_id=970d71040a81eee4a06f3c5d4ff50412c45c66ce&os_rom=android&udid=970d71040a81eee4a06f3c5d4ff50412c45c66ce&apikey=0dad551ec0f84ed02907ff5c42e8ec70&channel=360_Market&loc_id=118207";
    private String highBoxOfficeUrl = "https://frodo.douban.com/api/v2/subject_collection/movie_high_box_office/items?start=0&count=18&_ts=1485073287&_sig=zxBPZ38FRhwlvJYfPgQMxYr9%2F%2FI%3D&device_id=970d71040a81eee4a06f3c5d4ff50412c45c66ce&os_rom=android&udid=970d71040a81eee4a06f3c5d4ff50412c45c66ce&apikey=0dad551ec0f84ed02907ff5c42e8ec70&channel=360_Market&loc_id=118207";
    private String top250Url = "https://frodo.douban.com/api/v2/subject_collection/movie_top250/items?start=0&count=18&_ts=1485073017&_sig=4h6WfoiGDEDX3eEBfo1ujmhLbWM%3D&device_id=970d71040a81eee4a06f3c5d4ff50412c45c66ce&os_rom=android&udid=970d71040a81eee4a06f3c5d4ff50412c45c66ce&apikey=0dad551ec0f84ed02907ff5c42e8ec70&channel=360_Market&loc_id=118207";


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_collection, container, false);
        ButterKnife.bind(this, view);
        layoutFooter = (RelativeLayout) view.findViewById(R.id.layout_footer);
        gson = ThisApp.gson;
        queue = ThisApp.queue;
        StringRequest[] request = new StringRequest[3];
        request[0] = new StringRequest(bestUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                proBar.setVisibility(View.GONE);
                Best Best = gson.fromJson(s, Best.class);
                List<Best.SubjectCollectionItemsBean> list = Best.getSubject_collection_items();
                gridBest.setFocusable(false);
                gridBest.setAdapter(new BestAdapter(list, mActivity));
                final List<String> idList = new ArrayList<>();
                for (Best.SubjectCollectionItemsBean bean : list) {
                    idList.add(bean.getId());
                }
                gridBest.setOnItemClickListener(Listener.getOnItemClickListener(mActivity,idList));
                layoutMore.setVisibility(View.VISIBLE);
            }
        }, null) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return VolleyUtil.getFrodoHeaders();
            }
        };
        request[1] = new StringRequest(highBoxOfficeUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                HighBoxOffice office = gson.fromJson(s, HighBoxOffice.class);
                List<HighBoxOffice.SubjectCollectionItemsBean> list = office.getSubject_collection_items();
                gridHighBoxOffice.setAdapter(new HighBoxOfficeAdapter(list, mActivity));
                gridHighBoxOffice.setFocusable(false);
                final List<String> idList = new ArrayList<>();
                for (HighBoxOffice.SubjectCollectionItemsBean bean : list) {
                    idList.add(bean.getId());
                }
                gridHighBoxOffice.setOnItemClickListener(Listener.getOnItemClickListener(mActivity,idList));
            }
        }, null) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return VolleyUtil.getFrodoHeaders();
            }
        };
        ;
        layoutMore.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMore0.setText("-----------------本周票房榜----------------");
                layoutMore.setBackgroundResource(R.color.main);
                gridHighBoxOffice.setVisibility(View.VISIBLE);
                layoutMore1.setVisibility(View.VISIBLE);
            }
        });
        request[2] = new StringRequest(top250Url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Top250 top250 = gson.fromJson(s, Top250.class);
                top250List = top250.getSubject_collection_items();
                start=top250List.size();
                top250Adapter = new Top250Adapter(top250List, mActivity);
                gridTop250.setAdapter(top250Adapter);
                gridTop250.setFocusable(false);
                top250IdList = new ArrayList<>();
                for (Top250.SubjectCollectionItemsBean bean : top250List) {
                    top250IdList.add(bean.getId());
                }
                gridTop250.setOnItemClickListener(Listener.getOnItemClickListener(mActivity,top250IdList));
            }
        }, null) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return VolleyUtil.getFrodoHeaders();
            }
        };
        layoutMore1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                tvMore1.setText("-----------------TOP250----------------");
                layoutMore1.setBackgroundResource(R.color.main);
                gridTop250.setVisibility(View.VISIBLE);
                layoutFooter.setVisibility(View.VISIBLE);
            }
        });
        layoutFooter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proBarMore.setVisibility(View.VISIBLE);
                StringRequest moreRequest = new StringRequest(top250Url.replace("start=0", "start=" + start), new Response.Listener<String>() {
                    @Override
                    public void onResponse(String s) {
                        proBarMore.setVisibility(View.GONE);
                        Top250 top250=gson.fromJson(s, Top250.class);
                        top250List.addAll(top250.getSubject_collection_items());
                        for(int i=start;i<top250List.size();i++){
                            Top250.SubjectCollectionItemsBean bean=top250List.get(i);
                            top250IdList.add(bean.getId());
                        }
                        start = top250List.size();
                        top250Adapter.notifyDataSetChanged();
                    }
                }, null) {
                    @Override
                    public Map<String, String> getHeaders() throws AuthFailureError {
                        return VolleyUtil.getFrodoHeaders();
                    }
                };
                queue.add(moreRequest);
            }
        });
        queue.add(request[0]);
        queue.add(request[1]);
        queue.add(request[2]);
        return view;
    }
}
