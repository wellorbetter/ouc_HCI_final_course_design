package com.example.myapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

import java.util.List;

public class bottomNavigationAdapter extends FragmentStatePagerAdapter {

    private List<Fragment> mFragment;

    public bottomNavigationAdapter(@NonNull FragmentManager fm, List<Fragment> mFragment) {
        super(fm);
        this.mFragment = mFragment;
    }


    @NonNull
    @Override
    public Fragment getItem(int position) {
        return mFragment == null ? null : mFragment.get(position);
    }

    @Override
    public int getCount() {
        return mFragment == null ? null : mFragment.size();
    }
}
