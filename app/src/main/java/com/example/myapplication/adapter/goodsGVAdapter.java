package com.example.myapplication.adapter;

import android.app.Activity;
import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.recyclerview.widget.RecyclerView;

import com.example.myapplication.R;
import com.example.myapplication.bean.Goods;
import com.example.myapplication.bean.publishedGoods;

import java.util.List;

public class goodsGVAdapter extends BaseAdapter {

    private Context mContext;

    public goodsGVAdapter(Context mContext, List<publishedGoods> mGoodsList) {
        this.mContext = mContext;
        this.mGoodsList = mGoodsList;
    }

    private List<publishedGoods> mGoodsList;

    @Override
    public int getCount() {
        return mGoodsList.size();
    }

    @Override
    public Object getItem(int position) {
        return mGoodsList.get(position);
    }

    @Override
    public long getItemId(int position) {
        return position;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        ViewHolder holder;
        if (convertView == null) {
            convertView = LayoutInflater.from(mContext).inflate(R.layout.item_goods, null);
            holder = new ViewHolder();
            holder.image_goods = convertView.findViewById(R.id.image_goods);
            holder.user_avatar = convertView.findViewById(R.id.user_avatar);
            holder.user_nickname = convertView.findViewById(R.id.user_nickname);
            holder.tv_goods_desc = convertView.findViewById(R.id.tv_goods_desc);
            holder.tv_goods_price = convertView.findViewById(R.id.tv_goods_price);
            convertView.setTag(holder);
        } else {
            holder = (ViewHolder) convertView.getTag();
        }
        publishedGoods goods = mGoodsList.get(position);
        holder.image_goods.setImageResource(goods.getPicture());
        holder.tv_goods_desc.setText(goods.getDesc());
        holder.tv_goods_price.setText(String.valueOf(goods.getPrice()));
        holder.user_nickname.setText(goods.getName());
        holder.user_avatar.setImageResource(goods.getAvatar());
        return convertView;
    }
    static class ViewHolder {
        ImageView image_goods;
        ImageView user_avatar;
        TextView user_nickname;
        TextView tv_goods_desc;
        TextView tv_goods_price;
    }
}
