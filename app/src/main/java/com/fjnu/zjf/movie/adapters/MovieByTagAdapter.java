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
import com.fjnu.zjf.movie.beans.TagBean;
import com.fjnu.zjf.movie.utils.StringUtil;
import com.squareup.picasso.Picasso;

import java.util.ArrayList;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/2/7 0007.
 */

public class MovieByTagAdapter extends BaseAdapter {
    private List<TagBean.DataBean> list;
    private LayoutInflater layoutInflater;
    private Context context;

    public MovieByTagAdapter(List<TagBean.DataBean> list, Context context) {
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
            convertView = layoutInflater.inflate(R.layout.item_listview_tag, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else viewHolder = (ViewHolder) convertView.getTag();
        TagBean.DataBean.RatingBean ratingBean = list.get(position).getRating();
        if (ratingBean == null) {
            viewHolder.rating.setVisibility(View.GONE);
            viewHolder.tvRating.setText("暂无评分");
        } else {
            double rating = ratingBean.getValue();
            if (rating == 0) {
                viewHolder.rating.setVisibility(View.GONE);
                viewHolder.tvRating.setText("暂无评分");
            } else {
                viewHolder.rating.setVisibility(View.VISIBLE);
                viewHolder.tvRating.setText(String.valueOf(rating).substring(0, 3));
                viewHolder.rating.setRating((float) rating / 2);//setRating的参数决定星星颗数
            }
        }
        viewHolder.tvTitle.setText(list.get(position).getTitle());
        List<String> directorList = new ArrayList<>();
        for (TagBean.DataBean.DirectorsBean bean : list.get(position).getDirectors()) {
            directorList.add(bean.getName());
        }
        List<TagBean.DataBean.ActorsBean> mList = list.get(position).getActors();
        List<String> actorList = new ArrayList<>();
        if (mList.size() > 2) mList = mList.subList(0, 3);
        for (TagBean.DataBean.ActorsBean bean : mList) {
            actorList.add(bean.getName());
        }
        viewHolder.tvDirector.setText("导演：" + StringUtil.divideString(directorList));
        viewHolder.tvCasts.setText("主演：" + StringUtil.divideString(actorList));
        Picasso.with(context).load(list.get(position).getPic().getNormal()).into(viewHolder.ivListview);
        return convertView;
    }

    static class ViewHolder {
        @BindView(R.id.iv_listview)
        ImageView ivListview;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.rating)
        RatingBar rating;
        @BindView(R.id.tv_rating)
        TextView tvRating;
        @BindView(R.id.tv_director)
        TextView tvDirector;
        @BindView(R.id.tv_casts)
        TextView tvCasts;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
