package com.example.myapplication.adapter;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentPagerAdapter;

import com.example.myapplication.fragment.launchFragment;

public class luanchImprovedAdapter extends FragmentPagerAdapter {


    private final int[] mImageArray;

    public luanchImprovedAdapter(@NonNull FragmentManager fm, int[] launchImageArray) {
        super(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT);
        this.mImageArray = launchImageArray;
    }

    @NonNull
    @Override
    public Fragment getItem(int position) {
        return launchFragment.newInstance(position, mImageArray[position], mImageArray.length);
    }

    @Override
    public int getCount() {
        return mImageArray.length;
    }
}
