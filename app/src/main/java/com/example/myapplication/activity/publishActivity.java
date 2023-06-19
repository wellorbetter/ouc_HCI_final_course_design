package com.example.myapplication.activity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.database.UserDBHelper;

import java.util.ArrayList;
import java.util.List;

public class publishActivity extends AppCompatActivity implements View.OnClickListener {

    private UserDBHelper mHelper;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Spinner spinner_delivery_method = (Spinner) findViewById(R.id.spinner_delivery_method);
        Spinner spinner_permission_setting = (Spinner) findViewById(R.id.spinner_permission_setting);
        List<String> dataList = new ArrayList<>();
        dataList.add("面提");
        dataList.add("邮寄");

        ArrayAdapter<String> deliver_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, dataList);
        deliver_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_delivery_method.setAdapter(deliver_adapter);
        spinner_delivery_method.setSelection(0);
        spinner_delivery_method.setPrompt("面提");

        List<String> permission_dataList = new ArrayList<>();
        permission_dataList.add("所有人可见");
        permission_dataList.add("仅我可见");
        ArrayAdapter<String> permission_adapter = new ArrayAdapter<>(this, android.R.layout.simple_spinner_item, permission_dataList);
        permission_adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        spinner_permission_setting.setAdapter(permission_adapter);
        spinner_permission_setting.setSelection(0);
        spinner_permission_setting.setPrompt("所有人可见");

        TextView btn_cancel = findViewById(R.id.btn_cancel);
        btn_cancel.setOnClickListener(this);
    }

    // 打开的时候链接数据库
    @Override
    protected void onStart() {
        super.onStart();
        mHelper = UserDBHelper.getInstance(this);
        mHelper.openReadLink();
        mHelper.openWriteLink();
    }

    @Override
    protected void onStop() {
        super.onStop();
        mHelper.closeLink();
    }

    @Override
    public void onClick(View v) {
        if (v.getId() == R.id.btn_cancel) {
            finish();
        }
    }
}