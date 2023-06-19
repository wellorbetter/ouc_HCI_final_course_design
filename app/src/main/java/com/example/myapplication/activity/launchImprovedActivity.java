package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;

import com.example.myapplication.R;
import com.example.myapplication.adapter.LaunchAdapter;
import com.example.myapplication.adapter.luanchImprovedAdapter;

public class launchImprovedActivity extends AppCompatActivity {

    private int[] launchImageArray = {R.drawable.launch_1, R.drawable.launch_2,
            R.drawable.launch_3, R.drawable.launch_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch_improved);
        ViewPager vp_launch = findViewById(R.id.vp_launch);
        luanchImprovedAdapter adapter = new luanchImprovedAdapter(getSupportFragmentManager(),launchImageArray);
        vp_launch.setAdapter(adapter);

    }
}