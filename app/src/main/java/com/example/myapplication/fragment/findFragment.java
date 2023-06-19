package com.example.myapplication.fragment;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.adapter.homeFragmentAdapter;
import com.google.android.material.tabs.TabLayout;

import java.util.ArrayList;
import java.util.List;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link findFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class findFragment extends Fragment {

    private ViewPager mViewPager;
    private TabLayout mTabLayout;
    private List<Fragment> mFragmentList;
    private homeFragmentAdapter mHomeFragmentAdapter;
    private List<String> mTitleList;

    public static findFragment newInstance(String param1, String param2) {
        findFragment fragment = new findFragment();
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
        return inflater.inflate(R.layout.fragment_find, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        mTabLayout = view.findViewById(R.id.tab_layout);
        mViewPager = view.findViewById(R.id.home_vp);
        initData();
        mHomeFragmentAdapter = new homeFragmentAdapter(getChildFragmentManager(), mFragmentList, mTitleList);
        mViewPager.setAdapter(mHomeFragmentAdapter);
        mTabLayout.setupWithViewPager(mViewPager);
    }
    private void initData() {
        mFragmentList = new ArrayList<>();
        goodsRecommendedFragment fragment2 = goodsRecommendedFragment.newInstance("推荐", "");
        goodsLocalFragment fragment3 = goodsLocalFragment.newInstance("区域", "");
        mFragmentList.add(fragment2);
        mFragmentList.add(fragment3);

        mTitleList = new ArrayList<>();
        mTitleList.add("推荐");
        mTitleList.add("发现");
    }
}