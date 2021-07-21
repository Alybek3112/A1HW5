package com.example.a1hw5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;


public class FifthFragment extends Fragment implements View.OnClickListener {

    Button button;
    TextView textView;
    View view;

    public FifthFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_fifth, container, false);

        initViews();

        return view;
    }

    private void initViews() {
        button = view.findViewById(R.id.btn_fifth);
        textView = view.findViewById(R.id.et_fifth);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Bundle bundle= this.getArguments();
        String data= bundle.getString("4");
        textView.setText(data);

    }
}