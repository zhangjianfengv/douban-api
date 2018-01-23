package com.fjnu.zjf.movie.adapters;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import com.android.volley.RequestQueue;
import com.android.volley.toolbox.ImageLoader;
import com.android.volley.toolbox.Volley;
import com.fjnu.zjf.movie.R;
import com.fjnu.zjf.movie.beans.Detail;
import com.squareup.picasso.Picasso;

import java.util.List;

import butterknife.BindView;
import butterknife.ButterKnife;

/**
 * Created by Administrator on 2017/1/20 0020.
 */

public class CastAdapter extends BaseAdapter {
    private List<Detail.CastsBean> list;
    private LayoutInflater layoutInflater;
    private Context context;
    public CastAdapter(List<Detail.CastsBean> list, Context context) {
        this.list = list;
        this.context=context;
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
            convertView = layoutInflater.inflate(R.layout.item_listview_cast, null);
            viewHolder = new ViewHolder(convertView);
            convertView.setTag(viewHolder);
        } else viewHolder = (ViewHolder) convertView.getTag();
        viewHolder.nameCn.setText(list.get(position).getName());
        viewHolder.nameEn.setText(list.get(position).getName_en());
        if(list.get(position).getAvatars()!=null)Picasso.with(context).load(list.get(position).getAvatars().getMedium()).into(viewHolder.ivCast);
        else viewHolder.ivCast.setBackgroundResource(R.drawable.cast_loading);
        return convertView;
    }

    class ViewHolder {
        @BindView(R.id.iv_cast)
        ImageView ivCast;
        @BindView(R.id.name_cn)
        TextView nameCn;
        @BindView(R.id.name_en)
        TextView nameEn;

        ViewHolder(View view) {
            ButterKnife.bind(this, view);
        }
    }
}
