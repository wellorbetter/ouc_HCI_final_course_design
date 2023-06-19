package com.example.myapplication.activity;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.MenuItem;

import com.example.myapplication.R;
import com.example.myapplication.adapter.bottomNavigationAdapter;
import com.example.myapplication.fragment.findFragment;
import com.example.myapplication.fragment.homeFragment;
import com.example.myapplication.fragment.messageFragment;
import com.example.myapplication.fragment.mineFragment;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;

import java.util.ArrayList;
import java.util.List;

public class bottomNavigationActivity extends AppCompatActivity {

    private ViewPager mViewPager;
    private BottomNavigationView mBottomNavigationView;
    private bottomNavigationAdapter mStateVPAdapter;
    private List<Fragment> mFragmentList;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bottom_navigation);
        mViewPager = findViewById(R.id.vp);
        mBottomNavigationView = findViewById(R.id.bottom_menu);
        initData();
        mStateVPAdapter = new bottomNavigationAdapter(getSupportFragmentManager(), mFragmentList);
        mViewPager.setAdapter(mStateVPAdapter);
        mViewPager.setOnPageChangeListener(new ViewPager.OnPageChangeListener() {
            @Override
            public void onPageScrolled(int position, float positionOffset, int positionOffsetPixels) {

            }

            @Override
            public void onPageSelected(int position) {
                onPagerSelected(position);
            }

            @Override
            public void onPageScrollStateChanged(int state) {

            }
        });
        mBottomNavigationView.setBackgroundColor(getColor(R.color.lightsalmon));
        mBottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                if (item.getItemId() == R.id.menu_home) {
                    mViewPager.setCurrentItem(0);
                } else if (item.getItemId() == R.id.menu_find) {
                    mViewPager.setCurrentItem(1);
                } else if (item.getItemId() == R.id.menu_message) {
                    mViewPager.setCurrentItem(2);
                } else if (item.getItemId() == R.id.menu_mine) {
                    mViewPager.setCurrentItem(3);
                }
                return true;
            }
        });
        BadgeDrawable badgeDrawable = mBottomNavigationView.getOrCreateBadge(R.id.menu_message);
        badgeDrawable.setNumber(100);
        badgeDrawable.setMaxCharacterCount(3);
    }
    private void onPagerSelected(int position) {
        switch (position) {
            case 0:
                mBottomNavigationView.setSelectedItemId(R.id.menu_home);
                break;
            case 1:
                mBottomNavigationView.setSelectedItemId(R.id.menu_find);
                break;
            case 2:
                mBottomNavigationView.removeBadge(R.id.menu_message);
                mBottomNavigationView.setSelectedItemId(R.id.menu_message);
                break;
            case 3:
                mBottomNavigationView.setSelectedItemId(R.id.menu_mine);
                break;
            default:
                break;
        }
    }
    private void initData() {
        mFragmentList = new ArrayList<>();
        findFragment mFindFragment = findFragment.newInstance("发现", "");
        homeFragment mHomeFragment = homeFragment.newInstance();
        mineFragment mMineFragment = mineFragment.newInstance("", "");
        messageFragment mMessageFragment = messageFragment.newInstance("", "");
        // 也许发布页应该在这里
        mFragmentList.add(mHomeFragment);
        mFragmentList.add(mFindFragment);
        mFragmentList.add(mMessageFragment);
        mFragmentList.add(mMineFragment);
    }
}