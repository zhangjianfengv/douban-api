package com.fjnu.zjf.movie;


import android.os.Bundle;
import android.os.Handler;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RatingBar;
import android.widget.ScrollView;
import android.widget.TextView;
import android.widget.Toast;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.VolleyError;
import com.android.volley.toolbox.StringRequest;
import com.fjnu.zjf.movie.adapters.CastAdapter;
import com.fjnu.zjf.movie.adapters.CommentsInIntroductionAdapter;
import com.fjnu.zjf.movie.beans.Detail;
import com.fjnu.zjf.movie.utils.StringUtil;
import com.fjnu.zjf.movie.widgets.AppendableListView;
import com.google.gson.Gson;
import com.squareup.picasso.Picasso;

import java.io.UnsupportedEncodingException;

import butterknife.BindView;
import butterknife.ButterKnife;


/**
 * A simple {@link Fragment} subclass.
 */
public class IntroductionFragment extends BaseFragment {

    @BindView(R.id.iv)
    ImageView iv;
    @BindView(R.id.rating)
    RatingBar rating;
    @BindView(R.id.tv_rating)
    TextView tvRating;
    @BindView(R.id.tv_rating_count)
    TextView tvRatingCount;
    @BindView(R.id.tv_pub_date)
    TextView tvPubDate;
    @BindView(R.id.tv_duration)
    TextView tvDuration;
    @BindView(R.id.tv_genres)
    TextView tvGenres;
    @BindView(R.id.tv_countries)
    TextView tvCountries;
    @BindView(R.id.tv_summary)
    TextView tvSummary;
    @BindView(R.id.iv_cast)
    ImageView ivCast;
    @BindView(R.id.name_cn)
    TextView nameCn;
    @BindView(R.id.name_en)
    TextView nameEn;
    @BindView(R.id.lv_cast)
    AppendableListView lvCast;
    @BindView(R.id.layout_director)
    LinearLayout layoutDirector;
    @BindView(R.id.lv_comments)
    AppendableListView lvComments;
    @BindView(R.id.scroll_detail)
    ScrollView scrollDetail;
    private String url = "http://api.douban.com/v2/movie/subject/26948106?udid=f280acb2c8c0fb9c55b2ecdc9fb88a2b59b6d9e4&client=s%3Amobile%7Cy%3AAndroid+4.2.2%7Co%3AG3812ZNUANF1%7Cf%3A73%7Cv%3A2.7.7%7Cm%3ADoubanTest%7Cd%3A358180054335623%7Ce%3Asamsung+wilcoxds%7Css%3A540x960&apikey=0b2bdeda43b5688921839c8ecb20399b&city=%E5%8C%97%E4%BA%AC";
    private Gson gson;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View rootView = inflater.inflate(R.layout.fragment_introduction, container, false);
        ButterKnife.bind(this, rootView);
        gson = ThisApp.gson;
        String id = mActivity.getIntent().getStringExtra("id");
        RequestQueue queue = ThisApp.queue;
        StringRequest request = new StringRequest(url.replace("26948106", id), new Response.Listener<String>() {
            @Override
            public void onResponse(String s) {
                Detail detail = gson.fromJson(s, Detail.class);
                Picasso.with(mActivity).load(detail.getImages().getLarge()).placeholder(R.drawable.loading).into(iv);
                if (detail.getDirectors().size() != 0) {
                    nameCn.setText(detail.getDirectors().get(0).getName() + "[导演]");
                    nameEn.setText(detail.getDirectors().get(0).getName_en());
                    if (detail.getDirectors().get(0).getAvatars() != null)
                        Picasso.with(mActivity).load(detail.getDirectors().get(0).getAvatars().getMedium()).placeholder(R.drawable.cast_loading).into(ivCast);
                    else ivCast.setImageResource(R.drawable.cast_loading);
                } else layoutDirector.setVisibility(View.GONE);
                double mRating = detail.getRating().getAverage();
                if (mRating == 0) tvRating.setText("暂无评分");
                else {
                    tvRating.setText(String.valueOf(mRating));
                    tvRatingCount.setText("(" + detail.getRatings_count() + "人评分)");
                }
                rating.setRating((float) mRating / 2);
                if (detail.getDurations().size() != 0) {
                    if (!detail.getMainland_pubdate().equals(""))
                        tvPubDate.setText(detail.getMainland_pubdate() + "(大陆)/");
                    tvDuration.setText(detail.getDurations().get(0));
                } else tvPubDate.setText(detail.getMainland_pubdate() + "(大陆)");
                tvGenres.setText(StringUtil.divideString(detail.getGenres()));
                tvCountries.setText(StringUtil.divideString(detail.getCountries()));
                tvSummary.setText(detail.getSummary());
                lvCast.setAdapter(new CastAdapter(detail.getCasts(), mActivity));
                lvComments.setAdapter(new CommentsInIntroductionAdapter(detail.getPopular_comments(), mActivity));
                new Handler().postDelayed(new Runnable() {
                    @Override
                    public void run() {
                        scrollDetail.scrollTo(0, 0);
                    }
                }, 200);
            }
        }, new Response.ErrorListener() {
            @Override
            public void onErrorResponse(VolleyError volleyError) {
                byte[] htmlBodyBytes = volleyError.networkResponse.data;
                try {
                    Toast.makeText(mActivity,new String(htmlBodyBytes,"UTF-8"),Toast.LENGTH_LONG).show();
                } catch (UnsupportedEncodingException e) {
                    e.printStackTrace();
                }
            }
        });
        queue.add(request);
        return rootView;
    }
}
