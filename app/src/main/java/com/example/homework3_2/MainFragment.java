package com.example.homework3_2;

import android.annotation.SuppressLint;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class MainFragment extends Fragment {

    private TextView text0;
    private Button bt_r;
    private Button bt_b;
    private Button bt_g;
    private Integer num0 = null;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_main, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        text0 = view.findViewById(R.id.num0);
        num0 = Integer.parseInt(text0.getText().toString());
        view.findViewById(R.id.bt_red).setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View view) {
                num0 -= 1;
                text0.setText(String.valueOf(num0));


            }
        });
        view.findViewById(R.id.bt_blue).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num0 += 1;
                text0.setText(String.valueOf(num0));
            }
        });
        view.findViewById(R.id.bt_green).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                num0 = 0;
                text0.setText(String.valueOf(num0));
            }
        });

    }


}