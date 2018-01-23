package com.fjnu.zjf.movie;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ListView;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.android.volley.toolbox.Volley;
import com.fjnu.zjf.movie.activities.MovieDetailActivity;
import com.fjnu.zjf.movie.adapters.CommentsAdapter;
import com.fjnu.zjf.movie.beans.Comments;
import com.google.gson.Gson;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class CommentsFragment extends BaseFragment {

    @BindView(R.id.lv_comments)
    ListView lvComments;
    @BindView(R.id.pro_bar_comment)
    ProgressBar proBarComment;
    ProgressBar proBarMore;
    private String url = "https://api.douban.com/v2/movie/subject/21324900/comments?count=20&udid=f280acb2c8c0fb9c55b2ecdc9fb88a2b59b6d9e4&start=0&client=s%3Amobile%7Cy%3AAndroid+4.2.2%7Co%3AG3812ZNUANF1%7Cf%3A73%7Cv%3A2.7.7%7Cm%3ADoubanTest%7Cd%3A358180054335623%7Ce%3Asamsung+wilcoxds%7Css%3A540x960&apikey=0b2bdeda43b5688921839c8ecb20399b";
    private Gson gson;
    private int start=20;
    private String id;
    private List<Comments.CommentsBean> list;
    private CommentsAdapter adapter;
    public View onCreateView(final LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_comments, container, false);
        ButterKnife.bind(this, view);
        final RequestQueue queue = ThisApp.queue;
        id = mActivity.getIntent().getStringExtra("id");
        gson = ThisApp.gson;
        StringRequest request = new StringRequest(url.replace("21324900", id), new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                proBarComment.setVisibility(View.GONE);
                Comments comments = gson.fromJson(s, Comments.class);
                list=comments.getComments();
                adapter=new CommentsAdapter(list,mActivity);
                lvComments.setAdapter(adapter);
                View footerView = inflater.inflate(R.layout.footer_listview_comments, null);
                proBarMore= (ProgressBar) footerView.findViewById(R.id.pro_bar_more);
                lvComments.addFooterView(footerView);
                footerView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        proBarMore.setVisibility(View.VISIBLE);
                        StringRequest moreRequest=new StringRequest(url.replace("21324900", id).replace("start=0", "start=" + start), new Response.Listener<String>() {
                            @Override
                            public void onResponse(String s) {
                                proBarMore.setVisibility(View.GONE);
                                start+=20;
                                list.addAll(gson.fromJson(s, Comments.class).getComments());
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
