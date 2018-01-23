package com.fjnu.zjf.movie;


import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fjnu.zjf.movie.activities.ReviewDetailActivity;
import com.fjnu.zjf.movie.adapters.ReviewsAdapter;
import com.fjnu.zjf.movie.beans.Reviews;
import com.fjnu.zjf.movie.utils.SharedPreferencesUtil;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class ReviewsFragment extends BaseFragment {


    @BindView(R.id.pro_bar_reviews)
    ProgressBar proBarReviews;
    @BindView(R.id.lv_reviews)
    ListView lvReviews;
    ProgressBar proBarMore;
    TextView tvMore;
    private String url="https://api.douban.com/v2/movie/subject/26325320/reviews?count=20&udid=f280acb2c8c0fb9c55b2ecdc9fb88a2b59b6d9e4&start=0&client=s%3Amobile%7Cy%3AAndroid+4.2.2%7Co%3AG3812ZNUANF1%7Cf%3A73%7Cv%3A2.7.7%7Cm%3ADoubanTest%7Cd%3A358180054335623%7Ce%3Asamsung+wilcoxds%7Css%3A540x960&apikey=0b2bdeda43b5688921839c8ecb20399b";
    private Gson gson;
    private int start=20;
    private String id;
    private List<Reviews.ReviewsBean> list;
    private ReviewsAdapter adapter;
    @Override
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_reviews, container, false);
        ButterKnife.bind(this, view);
        final RequestQueue queue =ThisApp.queue;
        id = mActivity.getIntent().getStringExtra("id");
        gson = ThisApp.gson;
        StringRequest request = new StringRequest(url.replace("26325320", id), new Response.Listener<String>() {
            @Override
            public void onResponse(final String s) {
                SharedPreferencesUtil.getEditor(mActivity).putString("reviewList0",s).apply();
                proBarReviews.setVisibility(View.GONE);
                Reviews Reviews = gson.fromJson(s, Reviews.class);
                list=Reviews.getReviews();
                adapter=new ReviewsAdapter(list, mActivity);
                lvReviews.setAdapter(adapter);
                View footerView = inflater.inflate(R.layout.footer_listview_comments, null);
                proBarMore= (ProgressBar) footerView.findViewById(R.id.pro_bar_more);
                tvMore= (TextView) footerView.findViewById(R.id.tv_more);
                lvReviews.addFooterView(footerView);
                lvReviews.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        Intent intent=new Intent(mActivity, ReviewDetailActivity.class);
                        intent.putExtra("position",position);
                        startActivity(intent);
                    }
                });
                footerView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        proBarMore.setVisibility(View.VISIBLE);
                        StringRequest moreRequest=new StringRequest(url.replace("26325320", id).replace("start=0", "start=" + start), new Response.Listener<String>() {
                            @Override
                            public void onResponse(String s1) {
                                SharedPreferencesUtil.getEditor(mActivity).putString("reviewList"+start/20,s1).apply();//看来键值不同是不会覆盖整个文件的
                                proBarMore.setVisibility(View.GONE);
                                start+=20;
                                list.addAll(gson.fromJson(s1, Reviews.class).getReviews());
                                adapter.notifyDataSetChanged();
                            }
                        },null);
                        queue.add(moreRequest);
                    }
                });
            }
        }, null);
        queue.add(request);
        return view;
    }

}
