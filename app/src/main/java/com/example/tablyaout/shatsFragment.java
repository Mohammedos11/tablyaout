package com.example.tablyaout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

public class shatsFragment extends Fragment {

    private TextView displayTextView;

    public shatsFragment() {

    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.fragment_shats, container, false);


        displayTextView = view.findViewById(R.id.tv1);


        if (getArguments() != null) {
            String enteredText = getArguments().getString("entered_text");
            displayTextView.setText(enteredText);
        }

        return view;
    }
}
