package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.myapplication.R;

public class loginActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView register_btn;
    private ImageView login_btn;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        register_btn = findViewById(R.id.register_btn);
        login_btn = findViewById(R.id.login_btn);
        register_btn.setOnClickListener(this);
        login_btn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.register_btn) {
            ((TextView)v).setTextColor(ContextCompat.getColor(this, R.color.gray));
            Intent intent = new Intent(this, registerActivity.class);
            startActivity(intent);
            finish();
        } else if (v.getId() == R.id.login_btn) {
            Intent intent = new Intent(this, bottomNavigationActivity.class);
            startActivity(intent);
            finish();
        }
    }
}