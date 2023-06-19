package com.example.myapplication.fragment;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.os.Bundle;

import androidx.core.widget.CompoundButtonCompat;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.RadioButton;
import android.widget.RadioGroup;

import com.example.myapplication.R;
import com.example.myapplication.activity.loginActivity;
import com.example.myapplication.util.ToastUtil;

public class launchFragment extends Fragment {

    public static launchFragment newInstance(int position, int image_id, int length) {
        launchFragment fragment = new launchFragment();
        Bundle args = new Bundle();
        args.putInt("position", position);
        args.putInt("image_id", image_id);
        args.putInt("length", length);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        Bundle arguments = getArguments();
        Context context = getActivity();
//        ToastUtil.show(context, arguments.toString());
        int position = arguments.getInt("position");
        int image_id = arguments.getInt("image_id");
        int length = arguments.getInt("length");
        View view = inflater.inflate(R.layout.fragment_launch, container, false);
        ImageView iv_launch = view.findViewById(R.id.iv_launch);
        RadioGroup rg_indicate = view.findViewById(R.id.rg_indicate);
        Button btn_start = view.findViewById(R.id.btn_start);
        iv_launch.setImageResource(image_id);
        for (int i = 0; i < length; i ++ ) {
            RadioButton radio = new RadioButton(context);
            radio.setLayoutParams(new ViewGroup.LayoutParams(
                    ViewGroup.LayoutParams.WRAP_CONTENT,
                    ViewGroup.LayoutParams.WRAP_CONTENT
            ));
            radio.setPadding(10, 10, 10, 10);
            rg_indicate.addView(radio);
        }
        ColorStateList colorStateList = getResources().getColorStateList(R.color.blueviolet);
        CompoundButtonCompat.setButtonTintList( ((RadioButton) rg_indicate.getChildAt(position)), colorStateList);
        ((RadioButton) rg_indicate.getChildAt(position)).setChecked(true);
        if (position == length - 1) {
            btn_start.setVisibility(View.VISIBLE);
            btn_start.setOnClickListener(v -> {
                Intent intent = new Intent(context, loginActivity.class);
                ((Activity)context).startActivity(intent);
                ((Activity)context).finish();
            });
        }
        return view;
    }
}