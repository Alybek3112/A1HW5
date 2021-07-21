package com.example.a1hw5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;


public class FirstFragment extends Fragment implements View.OnClickListener {

    EditText text;
    Button button;
    View view;

    public FirstFragment() {
    }




    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        view = inflater.inflate(R.layout.fragment_first, container, false);

        initViews();
        return view;
    }

    private void initViews() {
        text = view.findViewById(R.id.et_main);
        button = view.findViewById(R.id.btn_main);
        button.setOnClickListener(this);
    }


    @Override
    public void onClick(View v) {
        Bundle bundle = new Bundle();
        bundle.putString("1", text.getText().toString());
        SecondFragment secondFragment = new SecondFragment();
        secondFragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, secondFragment).commit();
    }
}