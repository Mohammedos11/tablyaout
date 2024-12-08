package com.example.tablyaout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class StatusFragment extends Fragment {

    private static final String ARG_TEXT = "text";

    public StatusFragment() {

    }

    public static StatusFragment newInstance(String text) {
        StatusFragment fragment = new StatusFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TEXT, text);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_status, container, false);


        String inputText = getArguments() != null ? getArguments().getString(ARG_TEXT) : "";


        TextView textView = rootView.findViewById(R.id.tv2);
        textView.setText(inputText);

        return rootView;
    }
}
