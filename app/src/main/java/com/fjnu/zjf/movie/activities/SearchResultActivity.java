package com.fjnu.zjf.movie.activities;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.ProgressBar;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.ThisApp;
import com.fjnu.zjf.movie.adapters.SearchResultAdapter;
import com.fjnu.zjf.movie.beans.SearchResult;
import com.fjnu.zjf.movie.utils.Listener;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

public class SearchResultActivity extends AppCompatActivity {
    @BindView(R.id.pro_bar)
    ProgressBar proBar;
    @BindView(R.id.lv_result)
    ListView lvResult;
    private String url = "https://api.douban.com/v2/movie/search?q=%E8%A5%BF%E6%B8%B8&apikey=0b2bdeda43b5688921839c8ecb20399b&start=0&count=20&client=s%3Amobile%7Cy%3AAndroid+5.1.1%7Co%3AV8.1.3.0.LXKCNDI%7Cf%3A73%7Cv%3A2.7.7%7Cm%3ADoubanTest%7Cd%3A869545021705888%7Ce%3AXiaomi+libra%7Css%3A1080x1920&udid=511d577e5838353a5ffa0e9041fcf6e24e904de7";    private Gson gson;
    private RequestQueue queue;
    private SearchResultAdapter adapter;
    private List<SearchResult.SubjectsBean> list;
    private ProgressBar proBarMore;
    private int start=20;
    private List<String> idList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_search_result);
        ButterKnife.bind(this);
        ThisApp app= (ThisApp) getApplication();
        gson = app.gson;
        queue = app.queue;
        try {
            url=url.replace("%E8%A5%BF%E6%B8%B8",URLEncoder.encode(getIntent().getStringExtra("word"),"UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        final View footerView = LayoutInflater.from(this).inflate(R.layout.footer_listview_comments, null);
        proBarMore= (ProgressBar) footerView.findViewById(R.id.pro_bar_more);
        StringRequest request=new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                proBar.setVisibility(View.GONE);
                SearchResult result=gson.fromJson(s,SearchResult.class);
                idList=new ArrayList<>();
                list=result.getSubjects();
                for(SearchResult.SubjectsBean bean:list){
                    idList.add(bean.getId());
                }
                adapter=new SearchResultAdapter(list,SearchResultActivity.this);
                lvResult.setAdapter(adapter);
                lvResult.addFooterView(footerView);
                lvResult.setOnItemClickListener(Listener.getOnItemClickListener(SearchResultActivity.this,idList));
            }
        },null);
        footerView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                proBarMore.setVisibility(View.VISIBLE);
                StringRequest moreRequest= null;
                    moreRequest = new StringRequest(url.replace("start=0", "start=" + start), new Response.Listener<String>() {
                        @Override
                        public void onResponse(String s) {
                            proBarMore.setVisibility(View.GONE);
                            list.addAll(gson.fromJson(s, SearchResult.class).getSubjects());
                            for(int i=start;i<list.size();i++){
                                idList.add(list.get(i).getId());
                            }
                            adapter.notifyDataSetChanged();
                            start+=20;
                        }
                    },null);
                queue.add(moreRequest);
            }
        });
        queue.add(request);
    }
}
