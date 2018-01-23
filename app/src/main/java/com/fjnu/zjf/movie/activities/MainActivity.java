package com.fjnu.zjf.movie.activities;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.support.v4.view.ViewPager;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;

import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.adapters.MainViewPagerAdapter;
import com.gigamole.library.navigationtabstrip.NavigationTabStrip;

import butterknife.BindView;
import butterknife.ButterKnife;


public class MainActivity extends AppCompatActivity {

    @BindView(R.id.btn_search)
    ImageButton btnSearch;
    @BindView(R.id.toolbar)
    Toolbar toolbar;
    @BindView(R.id.tab_strip)
    NavigationTabStrip tabStrip;
    @BindView(R.id.pager)
    ViewPager pager;
    @BindView(R.id.edt_search)
    EditText edtSearch;
    @BindView(R.id.btn_go)
    ImageButton btnGo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Intent intent = new Intent(this, SplashActivity.class);
        startActivity(intent);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        if (getSupportActionBar() != null) getSupportActionBar().hide();
        btnSearch.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                toolbar.setTitle("");
                edtSearch.setVisibility(View.VISIBLE);
                edtSearch.requestFocus();
                btnGo.setVisibility(View.VISIBLE);
                btnSearch.setVisibility(View.GONE);
            }
        });
        btnGo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s=edtSearch.getText().toString();
                if(!s.equals("")) {
                    Intent intent1 = new Intent(MainActivity.this, SearchResultActivity.class);
                    intent1.putExtra("word", s);
                    startActivity(intent1);
                }
            }
        });
        pager.setAdapter(new MainViewPagerAdapter(getSupportFragmentManager()));
        pager.setOffscreenPageLimit(3);
        tabStrip.setViewPager(pager);
    }

}
