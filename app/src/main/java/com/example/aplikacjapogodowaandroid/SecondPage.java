package com.example.aplikacjapogodowaandroid;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class SecondPage extends Fragment {


    String title;

    public SecondPage(String title) {
        this.title = title;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View root = inflater.inflate(R.layout.fragment_second_page, container, false);
        TextView sampleTextView = root.findViewById(R.id.TextViewSecoundFragment);
        sampleTextView.setText(this.title);
        return root;
    }
}