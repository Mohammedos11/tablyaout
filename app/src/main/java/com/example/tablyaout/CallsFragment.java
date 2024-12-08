package com.example.tablyaout;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

public class CallsFragment extends Fragment {

    private EditText editTextInput;
    private Button submitButton;

    public CallsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View rootView = inflater.inflate(R.layout.fragment_calls, container, false);


        editTextInput = rootView.findViewById(R.id.editText);
        submitButton = rootView.findViewById(R.id.submitButton);


        submitButton.setOnClickListener(v -> {
            String inputText = editTextInput.getText().toString();

            StatusFragment statusFragment = StatusFragment.newInstance(inputText);
            FragmentTransaction transaction = getParentFragmentManager().beginTransaction();
            transaction.replace(R.id.fragment_container, statusFragment);
            transaction.addToBackStack(null);
            transaction.commit();
        });

        return rootView;
    }
}
