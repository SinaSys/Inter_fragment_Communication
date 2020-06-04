package com.example.inter_fragment_communication;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class FragmentB extends Fragment {

    TextView txtresult;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_b, container, false);

        txtresult = (TextView) view.findViewById(R.id.txtresult);
        return view;
    }

    public void addTwoNumbersInFragmentB(int x, int y) {
        int result = x + y;
        txtresult.setText("result : " + result);

    }
}
