package com.example.a1hw5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class SecondFragment extends Fragment implements View.OnClickListener {
    Button button;
    View view;


    public SecondFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_second, container, false);

        initViews();

        return view;
    }

    private void initViews() {
        button = view.findViewById(R.id.btn_second);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Bundle bundle= this.getArguments();
        String data= bundle.getString("1");
        bundle.putString("2",data);
        ThirdFragment thirdFragment= new ThirdFragment();
        thirdFragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, thirdFragment).commit();

    }
}