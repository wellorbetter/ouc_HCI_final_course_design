package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.view.View;

import com.example.myapplication.R;
import com.example.myapplication.adapter.LaunchAdapter;

public class launchActivity extends AppCompatActivity {

    private int[] launchImageArray = {R.drawable.launch_1, R.drawable.launch_2,
                                      R.drawable.launch_3, R.drawable.launch_4};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);
        ViewPager vp_launch = findViewById(R.id.vp_launch);
        LaunchAdapter adapter = new LaunchAdapter(this, launchImageArray);
        vp_launch.setAdapter(adapter);

    }
}