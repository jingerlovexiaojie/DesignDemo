package com.example.nala.designdemo;


import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * 只有一个文本
 */
public class BlankFragment extends Fragment {


    private TextView textview;

    public BlankFragment() {
    }

    public static BlankFragment newInstance(String text) {

        Bundle args = new Bundle();
        args.putString("text",text);
        BlankFragment fragment = new BlankFragment();
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_blank, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        textview =(TextView) view.findViewById(R.id.pager_text);
        String text = getArguments().getString("text");
        textview.setText(text);
    }
}
