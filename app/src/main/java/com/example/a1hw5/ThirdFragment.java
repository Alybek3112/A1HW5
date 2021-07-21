package com.example.a1hw5;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;


public class ThirdFragment extends Fragment implements View.OnClickListener {

    Button button;
    View view;

    public ThirdFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        view= inflater.inflate(R.layout.fragment_third, container, false);

        initViews();

        return view;

    }

    private void initViews() {
        button = view.findViewById(R.id.btn_third);
        button.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        Bundle bundle= this.getArguments();
        String data= bundle.getString("2");
        bundle.putString("3",data);
        FourthFragment fourthFragment = new FourthFragment();
        fourthFragment.setArguments(bundle);
        getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.main_container, fourthFragment).commit();

    }
}