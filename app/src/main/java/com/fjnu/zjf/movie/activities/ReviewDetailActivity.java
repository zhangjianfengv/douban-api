package com.fjnu.zjf.movie.activities;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Button;
import android.widget.RatingBar;
import android.widget.TextView;

import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.beans.Reviews;
import com.google.gson.Gson;

import butterknife.BindView;
import butterknife.ButterKnife;

public class ReviewDetailActivity extends AppCompatActivity {

    @BindView(R.id.tv_title)
    TextView tvTitle;
    @BindView(R.id.name_author)
    TextView nameAuthor;
    @BindView(R.id.rating)
    RatingBar rating;
    @BindView(R.id.tv_content)
    TextView tvContent;
    @BindView(R.id.btn_useful)
    Button btnUseful;
    @BindView(R.id.btn_useless)
    Button btnUseless;
    private Gson gson;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_review_detail);
        ButterKnife.bind(this);
        gson=new Gson();
        int position=getIntent().getIntExtra("position",0);
        String jsonString=getSharedPreferences("movie",MODE_PRIVATE).getString("reviewList"+position/20,"");
        Reviews.ReviewsBean reviewBean=gson.fromJson(jsonString, Reviews.class).getReviews().get(position%20);
        tvTitle.setText(reviewBean.getTitle());
        nameAuthor.setText(reviewBean.getAuthor().getName());
        rating.setRating(reviewBean.getRating().getValue());
        tvContent.setText(reviewBean.getContent());
        btnUseful.setText(reviewBean.getUseful_count()+"有用");
        btnUseless.setText(reviewBean.getUseless_count()+"没用");
    }
}
