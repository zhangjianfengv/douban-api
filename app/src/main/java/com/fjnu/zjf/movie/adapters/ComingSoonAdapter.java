package com.fjnu.zjf.movie.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.beans.ComingSoon;
import com.squareup.picasso.Picasso;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/1/20 0020.
 */

public class ComingSoonAdapter extends BaseAdapter {
    private List<ComingSoon.SubjectsBean> list;
    private LayoutInflater layoutInflater;
    private Context context;

    public ComingSoonAdapter(List<ComingSoon.SubjectsBean> list, Context context) {
        this.list = list;
        layoutInflater = LayoutInflater.from(context);
        this.context = context;
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
            convertView = layoutInflater.inflate(R.layout.item_gridview_coming_soon, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.tvTitle.setText(list.get(position).getTitle());
        viewHolder.tvDate.setText(convertDate(list.get(position).getRelease_date()));
        Picasso.with(context).load(list.get(position).getPic().getLarge()).placeholder(R.drawable.loading).into(viewHolder.ivGrid);
        return convertView;
    }

    public String convertDate(String date) {
        String formater = "yyyy-MM-dd";
        SimpleDateFormat format = new SimpleDateFormat(formater);
        try {
            Date date1 = format.parse(date);
            format.applyPattern("  M月d日 E");
            return format.format(date1);
        } catch (ParseException e) {
            e.printStackTrace();
        }
        return "";
    }

    static class ViewHolder {
        @BindView(R.id.iv_grid)
        ImageView ivGrid;
        @BindView(R.id.tv_title)
        TextView tvTitle;
        @BindView(R.id.tv_date)
        TextView tvDate;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
