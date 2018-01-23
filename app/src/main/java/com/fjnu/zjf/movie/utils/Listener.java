package com.fjnu.zjf.movie.utils;

import android.content.Context;
import android.content.Intent;
import android.view.View;
import android.widget.AdapterView;

import com.fjnu.zjf.movie.activities.MovieDetailActivity;
import com.fjnu.zjf.movie.activities.SearchResultActivity;

import java.util.List;

/**
 * Created by Administrator on 2017/2/5 0005.
 */

public class Listener {
    public static AdapterView.OnItemClickListener getOnItemClickListener(final Context context, final List<String> idList){
        AdapterView.OnItemClickListener listener=new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                Intent intent=new Intent(context,MovieDetailActivity.class);
                intent.putExtra("id",idList.get(position));
                context.startActivity(intent);
            }
        };
        return listener;
    }
}
