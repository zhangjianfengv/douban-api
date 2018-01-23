package com.fjnu.zjf.movie.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.RatingBar;
import android.widget.TextView;

import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.beans.Detail;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/1/20 0020.
 */

public class CommentsInIntroductionAdapter extends BaseAdapter {
    private List<Detail.PopularCommentsBean> list;
    private LayoutInflater layoutInflater;

    public CommentsInIntroductionAdapter(List<Detail.PopularCommentsBean> list, Context context) {
        this.list = list;
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
            convertView = layoutInflater.inflate(R.layout.item_listview_comments, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.nameAuthor.setText(list.get(position).getAuthor().getName());
        viewHolder.rating.setRating(list.get(position).getRating().getValue());
        viewHolder.tvContent.setText(list.get(position).getContent());
        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.name_author)
        TextView nameAuthor;
        @BindView(R.id.rating)
        RatingBar rating;
        @BindView(R.id.tv_content)
        TextView tvContent;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
