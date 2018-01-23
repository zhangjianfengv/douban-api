package com.fjnu.zjf.movie;


import android.graphics.Color;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.HorizontalScrollView;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;

import com.android.volley.AuthFailureError;
import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;
import com.fjnu.zjf.movie.adapters.MovieByTagAdapter;
import com.fjnu.zjf.movie.beans.TagBean;
import com.fjnu.zjf.movie.utils.DensityUtil;
import com.fjnu.zjf.movie.utils.Listener;
import com.fjnu.zjf.movie.utils.StringUtil;
import com.fjnu.zjf.movie.utils.VolleyUtil;
import com.fjnu.zjf.movie.widgets.AppendableListView;
import com.google.gson.Gson;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class MoreFragment extends BaseFragment implements View.OnClickListener{

    @BindView(R.id.activity_movie_tag)
    LinearLayout activityMovieTag;
    @BindView(R.id.lv_content)
    AppendableListView lvContent;
    @BindView(R.id.pro_bar)
    ProgressBar proBar;
    private DensityUtil densityUtil;
    private Gson gson;
    private RequestQueue queue;
    private int blue = Color.argb(255, 64, 226, 255);
    private String url = "https://frodo.douban.com/api/v2/movie/tag?start=0&count=20&sort=T&q=%E7%94%B5%E5%BD%B1&score_range=0,10&udid=4c4bae86c843a5d7e20d1963cdda6f43ef6a3309&device_id=4c4bae86c843a5d7e20d1963cdda6f43ef6a3309&channel=Xiaomi_Market&apiKey=0dad551ec0f84ed02907ff5c42e8ec70&os_rom=miui6&_sig=oKbYM9TIMHyCQM53Z6nwgWEN2GA%3D&_ts=1486439584";
    private String newUrl=url;
    private MovieByTagAdapter adapter;
    private List<TagBean.DataBean> list;
    private int start=20;
    private List<String> idList;
    public MoreFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_more, container, false);
        ButterKnife.bind(this,view);
        densityUtil = new DensityUtil(getContext());
        gson = ThisApp.gson;
        queue = ThisApp.queue;
        lvContent.setFocusable(false);
        StringRequest request = new StringRequest(url, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                proBar.setVisibility(View.GONE);
                TagBean tagBean = gson.fromJson(s, TagBean.class);
                initializeView(tagBean.getTags());
                list = tagBean.getData();
                idList=new ArrayList<>();
                for(TagBean.DataBean bean:list){
                    idList.add(bean.getId());
                }
                adapter = new MovieByTagAdapter(list,getContext());
                lvContent.setAdapter(adapter);
                View footerView = getActivity().getLayoutInflater().inflate(R.layout.footer_listview_comments,null);
                final ProgressBar proBarMore= (ProgressBar) footerView.findViewById(R.id.pro_bar_more);
                lvContent.addFooterView(footerView);
                lvContent.setOnItemClickListener(Listener.getOnItemClickListener(getActivity(),idList));
                footerView.setOnClickListener(new View.OnClickListener() {
                    @Override
                    public void onClick(View v) {
                        proBarMore.setVisibility(View.VISIBLE);
                        StringRequest moreRequest=new StringRequest(newUrl.replace("start=0", "start=" + start), new Response.Listener<String>() {
                            @Override
                            public void onResponse(String s) {
                                proBarMore.setVisibility(View.GONE);
                                list.addAll(gson.fromJson(s, TagBean.class).getData());
                                for(int i=start;i<list.size();i++){
                                    idList.add(list.get(i).getId());
                                }
                                start+=20;
                                adapter.notifyDataSetChanged();
                                lvContent.setOnItemClickListener(Listener.getOnItemClickListener(getActivity(),idList));
                            }
                        },null){
                            @Override
                            public Map<String, String> getHeaders() throws AuthFailureError {
                                return VolleyUtil.getFrodoHeaders();
                            }
                        };
                        queue.add(moreRequest);
                    }
                });
            }
        }, null) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return VolleyUtil.getFrodoHeaders();
            }
        };
        queue.add(request);
        return view;
    }

    @Override
    public void onClick(View v) {
        proBar.setVisibility(View.VISIBLE);
        lvContent.setVisibility(View.GONE);
        TextView textView = (TextView) v;
        LinearLayout layout = (LinearLayout) v.getParent();
        for (int i = 0; i < layout.getChildCount(); i++) {
            TextView tv = (TextView) layout.getChildAt(i);
            if (tv.getCurrentTextColor() == blue) tv.setTextColor(Color.BLACK);
        }
        textView.setTextColor(blue);
        List<String> tagList = new ArrayList<>();
        for (int i = 0; i < 4; i++) {
            HorizontalScrollView scrollView = (HorizontalScrollView) activityMovieTag.getChildAt(i);
            LinearLayout layout1 = (LinearLayout) scrollView.getChildAt(0);
            for (int j = 0; j < layout1.getChildCount(); j++) {
                TextView tv = (TextView) layout1.getChildAt(j);
                if (!tv.getText().toString().equals("全部") && tv.getCurrentTextColor() == blue)
                    tagList.add(tv.getText().toString());
            }
        }
        try {
            //(已改正)逻辑有问题，点一次替换一次，第二次就没办法替换了，也不会报错url = url.replace("%E7%94%B5%E5%BD%B1",URLEncoder.encode(StringUtil.divideStringByComma(tagList), "UTF-8"));
            newUrl = url.replace("%E7%94%B5%E5%BD%B1", URLEncoder.encode(StringUtil.divideStringByComma(tagList), "UTF-8"));
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        StringRequest request = new StringRequest(newUrl, new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                proBar.setVisibility(View.GONE);
                lvContent.setVisibility(View.VISIBLE);
                list = gson.fromJson(s, TagBean.class).getData();
                idList=new ArrayList<>();
                start=20;
                for(TagBean.DataBean bean:list){
                    idList.add(bean.getId());
                }
                adapter = new MovieByTagAdapter(list, getActivity());
                lvContent.setAdapter(adapter);
                //引用改变，重新设置点击事件
                lvContent.setOnItemClickListener(Listener.getOnItemClickListener(getActivity(),idList));
            }
        }, null) {
            @Override
            public Map<String, String> getHeaders() throws AuthFailureError {
                return VolleyUtil.getFrodoHeaders();
            }
        };
        queue.add(request);
    }

    public void initializeView(List<TagBean.TagsBean> tagBean){
        LinearLayout.LayoutParams params = new LinearLayout.LayoutParams(ViewGroup.LayoutParams.WRAP_CONTENT, ViewGroup.LayoutParams.WRAP_CONTENT);
        params.topMargin = densityUtil.dip2px(8);
        params.leftMargin = densityUtil.dip2px(7);
        for (int i = 0; i < tagBean.size(); i++) {
            List<String> list = tagBean.get(i).getData();
            HorizontalScrollView scrollView = (HorizontalScrollView) activityMovieTag.getChildAt(i);
            for (int j = 0; j < list.size(); j++) {
                String name = list.get(j);
                TextView textView = new TextView(getActivity());
                textView.setLayoutParams(params);
                textView.setText(name);
                textView.setTextColor(Color.BLACK);
                textView.setClickable(true);
                textView.setOnClickListener(this);
                if (j == 0) textView.setTextColor(blue);
                LinearLayout layout = (LinearLayout) scrollView.getChildAt(0);
                layout.addView(textView);
            }
        }
    }
}
