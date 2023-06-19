package com.example.myapplication.fragment;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.myapplication.R;
import com.example.myapplication.activity.loginActivity;
import com.example.myapplication.activity.publishActivity;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link mineFragment#newInstance} factory method to
 * create an instance of this fragment.
 */
public class mineFragment extends Fragment implements View.OnClickListener {

    private static final int BUTTON_LOGOUT_ACCOUNT = 1;
    private static final int BUTTON_SWITCH_ACCOUNT = 2;
    private static final int BUTTON_PUBLISH_GOODS = 3;
    public static mineFragment newInstance(String param1, String param2) {
        mineFragment fragment = new mineFragment();
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
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_mine, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        TextView btn_logout_account = view.findViewById(R.id.btn_logout_account);
        TextView btn_switch_account = view.findViewById(R.id.btn_switch_account);
        TextView btn_publish_goods = view.findViewById(R.id.btn_publish_goods);

        btn_logout_account.setTag(BUTTON_LOGOUT_ACCOUNT);
        btn_switch_account.setTag(BUTTON_SWITCH_ACCOUNT);
        btn_publish_goods.setTag(BUTTON_PUBLISH_GOODS);

        btn_switch_account.setOnClickListener(this);
        btn_logout_account.setOnClickListener(this);
        btn_publish_goods.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        int buttonTag = (int) v.getTag();
        if (buttonTag == BUTTON_LOGOUT_ACCOUNT) {
            Intent intent = new Intent(getActivity(), loginActivity.class);
            getActivity().startActivity(intent);
            getActivity().finish();
        } else if (buttonTag == BUTTON_SWITCH_ACCOUNT) {
            Intent intent = new Intent(getActivity(), loginActivity.class);
            getActivity().startActivity(intent);
            getActivity().finish();
        } else if (buttonTag == BUTTON_PUBLISH_GOODS) {
            Intent intent = new Intent(getActivity(), publishActivity.class);
            getActivity().startActivity(intent);
//            getActivity().finish();
            //这个似乎不用finish
        }
    }
}