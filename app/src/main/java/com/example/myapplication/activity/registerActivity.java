package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.TextView;

import com.example.myapplication.R;

public class registerActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView btn_return_login;
    private ImageButton btn_register;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
        btn_return_login = (TextView) findViewById(R.id.btn_return_login);
        btn_return_login.setOnClickListener(this);
        btn_register = (ImageButton) findViewById(R.id.btn_register);
        btn_register.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_return_login) {
            ((TextView)v).setTextColor(ContextCompat.getColor(this, R.color.gray));
            Intent intent = new Intent(this, loginActivity.class);
            startActivity(intent);
            finish();
        } else if (v.getId() == R.id.btn_register) {
            Intent intent = new Intent(this, loginActivity.class);
            startActivity(intent);
            finish();
        }
    }
}