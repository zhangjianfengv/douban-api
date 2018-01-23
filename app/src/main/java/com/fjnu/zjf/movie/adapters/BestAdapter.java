package com.fjnu.zjf.movie.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.RatingBar;
import android.widget.TextView;

import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.beans.Best;
import com.fjnu.zjf.movie.beans.Detail;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/1/20 0020.
 */

public class BestAdapter extends BaseAdapter {
    private List<Best.SubjectCollectionItemsBean> list;
    private LayoutInflater layoutInflater;
    private Context context;

    public BestAdapter(List<Best.SubjectCollectionItemsBean> list, Context context) {
        this.list = list;
        this.context = context;
        layoutInflater = LayoutInflater.from(context);
    }

    @Override
    public int getCount() {
        return list.size();
    }

    @Override
    public Object getItem(int position) {
        return list.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder viewHolder = null;
        if (convertView == null) {
            convertView = layoutInflater.inflate(R.layout.item_gridview_theater, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.tvTitle.setText(list.get(position).getTitle());
        viewHolder.rating.setRating((float) list.get(position).getRating().getValue()/2);
        viewHolder.tvRating.setText(String.valueOf(list.get(position).getRating().getValue()).substring(0,3));
        Picasso.with(context).load(list.get(position).getCover().getUrl()).into(viewHolder.ivGrid);
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.iv_grid)
        ImageView ivGrid;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.rating)
        RatingBar rating;
        @BindView(R.id.tv_rating)
        TextView tvRating;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
