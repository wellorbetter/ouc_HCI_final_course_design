package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.GridView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.goodsGVAdapter;
import com.example.myapplication.bean.publishedGoods;
import com.example.myapplication.util.ToastUtil;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link goodsRecommendedFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class goodsRecommendedFragment extends Fragment implements AdapterView.OnItemClickListener {

    private GridView gv_goods;
    private List<publishedGoods> goodsList;

    public static goodsRecommendedFragment newInstance(String param1, String param2) {
        goodsRecommendedFragment fragment = new goodsRecommendedFragment();
        Bundle args = new Bundle();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_goods_recommended, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        initData();
        gv_goods = view.findViewById(R.id.gv_goods);
        goodsGVAdapter adapter = new goodsGVAdapter(getContext(), goodsList);
        gv_goods.setAdapter(adapter);
        gv_goods.setOnItemClickListener(this);
    }
    public void initData() {
        goodsList = new ArrayList<>();
        for (int i = 0; i < 20; i ++ ) {
            publishedGoods goods = publishedGoods.newInstance(128.9, "测试商品名字", 1, "这是测试商品的描述",
                    R.drawable.default_goods_avatar, 1, R.drawable.user_default_avatar, "测试用户名");
            goodsList.add(goods);
        }
    }
    @Override
    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
        ToastUtil.show(getContext(), goodsList.get(position).getName());
    }
}